
import java.util.Vector;
import java.util.Stack;
/**
 * The code describes the function that how to calculate the operation between several numbers
 * Given a formula like "2+3*5"
 * To begin with the first element of the formula,determine whether 2 is the number or the operator
 * If the element is a number,then push the number into the numberStack.
 * Then remove the 2 from the formula.
 * The next element is an operator,there is no operaor in the operatorStack right now.
 * Push the "+" into the operatorStack.Next time when we push "*" into the stack
 * if there exists two operators,we need to determine the precedence between  two operators
 * If the index of "*" is less than the index of "+",we can calculate the result.
 * On the contrary,we should push * into the operatorStack.
 * Then remove the "*" from the formula.
 * Determine the length of  formula which is in an array is no more than 1.
 * Push the last number"5" into the numberStack.
 * Then remove the number"5" from the array.
 * The length of the array is  less than 1.
 * Break the loop.
 * If the operatorStack is not empty,there are more than one element in the numberStack
 * To use the evaluate method to get the result.
 * Pop the opertor from the operatorStack and pop two numbers from the numberStack
 * Let 5 equal to  variable right and let number 3 equal to variable left,then calculate 5*3
 * Push the product into the numberStack.
 * The operatorStack is still not empty,and there are also more than one element in the numberStack.
 * Use the evaluate method to calculate the result one more time
 * Push the sum result into the numberStack.
 * There is no operator in the operatorStack
 * Break the loop.
 * Output the final result from the numberStack.
 * 
 * 
 * @author Zhuo Liu
 *@author Yuni Xie
 */
public class Calculator {

    // See https://docs.oracle.com/javase/10/docs/api/java/util/Stack.html
static Stack<Double> numberStack = new Stack<Double>();
static Stack<String> operatorStack = new Stack<String>();
    // See https://docs.oracle.com/javase/10/docs/api/java/lang/String.html
static String operators =  "+-%*/^" ;
static String openingP[] = { "(", "[", "{" };
static String closingP[] = { ")", "]", "}" };


public static void main (String args []) {
    performCalculation("1", "*", "{", "2", "+", "3", "-",
                       "[", "1", "*", "(", "2", "-", "1", ")", "]", "+", "3", "}");
    performCalculation("2", "+", "[", "(", "3", "-", "6", ")", "/", "5", "]");
    performCalculation("1", "+", "(", "2", "+", "3", ")", "*", "3");
    performCalculation("2", "^", "3","^", "4");
    performCalculation("(", "2", "^", "3", ")", "^", "4");
}

    // See https://docs.oracle.com/javase/8/docs/technotes/guides/language/varargs.html
    public static void performCalculation (String ... valuesAndOperators)	{
	Vector<String> aLine = new Vector<String>();   //foreach��������ΪString���͵�vector
	for ( String valuesAndOperator: valuesAndOperators )	{
		aLine.add(valuesAndOperator);
		System.out.print(valuesAndOperator + " ");
	}
	System.out.println(" =  " + calculate(aLine) );
    }
    
    
    /** drives the calculation and returns the result
     */
    public static double calculate (Vector<String> inputLine) {
	while ( inputLine.size() >= 1 )	{//vector�е�inputLineû��Ԫ��ʱ����ѭ��
		if ( operator( inputLine.firstElement() )	) 
			performOperator(inputLine.firstElement());
		else
			performNumber(inputLine.firstElement());

		inputLine.removeElementAt(0);//ÿ�����۶�operator����number��������Ҫremoveһ��vector�е�һ��Ԫ��
	}
	while ( !  operatorStack.empty() )	{//operatorStack�в�Ϊ�գ�Ϊ��ʱ����ѭ��
		if ( numberStack.size() > 1 )//numberStack��ֻ�л���������
			evaluate();
		else	{
			System.out.println("dangling operand ....");
			System.out.println(numberStack);
			System.exit(1);
		
		}
	}

	return numberStack.pop();//������ս��
    }

    /** perform the required operation based on precedence of the operators on the stack
     */
    public static boolean operator (String op) {//opeartor���������ж�vector��һ��Ԫ����operators�ַ������Ƿ���ڣ�û�ҵ��򷵻�-1
	return ( operators.indexOf(op) >= 0 );
    }

    /** deteremence a precedence level for the operator
     */
    public static int precedence (String op) {
	return operators.indexOf(op);//��Ϊ�������±��������������ַ���String�Ҳ����������ȼ��ߣ�precedence����ֻ�𵽷����±������
    }

    /** perform the required operation based on precedence on the stack
     */
    public static void performOperator (String op) {
		while (! operatorStack.empty()  &&
			(  precedence(op) < precedence(operatorStack.peek() ) )//��2+3*5��������ʱ*�±�>+�±꣬���Բ�ִ��evaluate�������������push��operator��
		      )+
				evaluate();
		operatorStack.push(op);
    }

    /** pushes the number on the number stack
     */
    public static void performNumber (String number) {
		numberStack.push(Double.valueOf(number));
    }

    /** get the number of the stack, if a number is available, else RIP
     */
    public static double  getNumber () {
	if ( numberStack.empty() ){
		System.out.println("not enough numbers ...");
		System.exit(2);
	} 
	return numberStack.pop();//��numberStack�е�Ԫ��pop��
    }

    /** perform the required ovperation based on the operator in the stack
     */
    public static void evaluate () {
		String currentOp = operatorStack.pop();//��operator�е�Ԫ��pop��
		double right = getNumber();
		double left = getNumber();
		if ( currentOp.equals("+") )
			numberStack.push( left + right );//�������Ľ���ٴ�����numberStack��
		else if ( currentOp.equals("-") )
			numberStack.push( left - right );
		else if ( currentOp.equals("*") )
			numberStack.push( left * right );
		else if ( currentOp.equals("%") )
			numberStack.push( left % right );
		else if ( currentOp.equals("/") )
			numberStack.push( left / right );
		else if ( currentOp.equals("^") )
			numberStack.push( Math.pow(left , right ) );
		else
			System.out.println("Unknow Operator");
    }
}