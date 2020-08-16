                /**
                 * This program finds the sum of two or several numbers
                 * 
                 * @author Zhuo Liu
                 * @author 
                 * 
                 */

                public class Sticks {
	           /**
	            * The main program.
	            *
	            * @param    args    command line arguments (ignored)
	            * 
	            * @return           no 
	            */
	
		        public static void main(String[] args) {
			    // TODO Auto-generated method stub
			    int[] stickLengths = { 1, 5, 8, 12, 12, 35, 35, 35, 61 };
			    int[] unknowStickLengths = { 1, 6, 9, 24, 110, 111, 115, 62, 24, 202, 203, 204, 205 };
			  
			    for(int index=0;index<unknowStickLengths.length;index++) {
			    int target=unknowStickLengths[index];
			    int s=0;
			    
			    
			    /**
				  * The for loop was given to find the sum of  several numbers 
				  * If we find the solution,break the for loop first
				  * Then let s equal 1 
				  * If s==1,perform continue to skip the rest of the  loop
				  * Fianlly we can find the least number of the combination
				  *
				  * @param     x      
				  * 
				  * @return       no 
				  */
			    for(int i=0;i<stickLengths.length;i++) {
			    	if(stickLengths[i]==target) {
			    	  System.out.println(stickLengths[i]+"="+target);
			    	               s=1;break;
			    	}
			    }
			            if(s==1) {
			    	    continue;
			            }
			        //The combination of two numbers
			    for(int i=0;i<stickLengths.length;i++) {
			    	for(int j=i+1;j<stickLengths.length;j++) {
			    		  if(stickLengths[i]+stickLengths[j]==target) {
			    		       System.out.println(stickLengths[i]+"+"+stickLengths[j]+"="+target);
			    		           s=1;break;
			    		}
			    	}
			    }
			    	   if(s==1) {
			    		continue;
				       }
			    //The combination of three numbers
			    for(int i=0;i<stickLengths.length;i++) {
			    		for(int j=i+1;j<stickLengths.length;j++) {
			    			for(int k=j+1;k<stickLengths.length;k++) {
			    				if(stickLengths[i]+stickLengths[j]+stickLengths[k]==target) {
			    				System.out.println(stickLengths[i]+"+"+stickLengths[j]+"+"+stickLengths[k]+"="+target);
			    				  s=1;break; 
			    				}
			    			}
			    		}
			    	}
			    	if(s==1) {
			        continue;
				    }
			    //The combination of four numbers
			    for(int i=0;i<stickLengths.length;i++) {
			    	for(int j=i+1;j<stickLengths.length;j++) {
			    		for(int k=j+1;k<stickLengths.length;k++) {
			    			for(int l=k+1;l<stickLengths.length;l++) {
			    				 if(stickLengths[i]+stickLengths[j]+stickLengths[k]+stickLengths[l]==target) {
			    				      System.out.println(stickLengths[i]+"+"+stickLengths[j]+"+"+stickLengths[k]+"+"+stickLengths[l]+"="+target);
			    				  s=1;break;
			    				}
			    			}
			    		}
			    	}
			    }
			    	if(s==1) {
			    	continue;
				    }
			    //The combination of five numbers
			    for(int i=0;i<stickLengths.length;i++) {
			    	for(int j=i+1;j<stickLengths.length;j++) {
			    		for(int k=j+1;k<stickLengths.length;k++) {
			    			for(int l=k+1;l<stickLengths.length;l++) {
			    				for(int m=l+1;m<stickLengths.length;m++) {		    				
			    				     if(stickLengths[i]+stickLengths[j]+stickLengths[k]+stickLengths[l]+stickLengths[m]==target) {
			    				          System.out.println(stickLengths[i]+"+"+stickLengths[j]+"+"+stickLengths[k]+"+"+stickLengths[l]+"+"+stickLengths[m]+"="+target);
			    				  s=1;break;
			    				       }
			 		    			}
			 		    		}
			 		    	}
			 		    }
			        }
			    	if(s==1){
			    	continue;
				    }
			    for(int i=0;i<stickLengths.length;i++) {
			    	for(int j=i+1;j<stickLengths.length;j++) {
			    		for(int k=j+1;k<stickLengths.length;k++) {
			    			for(int l=k+1;l<stickLengths.length;l++) {
			    				for(int m=l+1;m<stickLengths.length;m++) {		
			    					for(int n=m+1;n<stickLengths.length;n++) {	
			    				      if(stickLengths[i]+stickLengths[j]+stickLengths[k]+stickLengths[l]+stickLengths[m]+stickLengths[n]==target) {
			    				            System.out.println(stickLengths[i]+"+"+stickLengths[j]+"+"+stickLengths[k]+"+"+stickLengths[l]+
			    				            		"+"+stickLengths[m]+"+"+stickLengths[n]+"="+target);
			    				  s=1;break;
			    				       }
			 		    			}
			 		    		}
			 		    	}
			 		    }
			        }
			    }
			    	if(s==1){ 
			    	continue;
				    }
			    for(int i=0;i<stickLengths.length;i++) {
			    	for(int j=i+1;j<stickLengths.length;j++) {
			    		for(int k=j+1;k<stickLengths.length;k++) {
			    			for(int l=k+1;l<stickLengths.length;l++) {
			    				for(int m=l+1;m<stickLengths.length;m++) {		
			    					for(int n=m+1;n<stickLengths.length;n++) {	
			    						for(int o=n+1;o<stickLengths.length;o++) {
			    				           if(stickLengths[i]+stickLengths[j]+stickLengths[k]+stickLengths[l]+stickLengths[m]+
			    				        		   stickLengths[n]+stickLengths[o]==target) {
			    				                   System.out.println(stickLengths[i]+"+"+stickLengths[j]+"+"+stickLengths[k]+
			    				                		   "+"+stickLengths[l]+"+"+stickLengths[m]+"+"+stickLengths[n]+"+"+stickLengths[o]+"="+target);
			    				  s=1;break;
			    				               }
					 		    			}
					 		    		}
					 		    	}
					 		    }
					        }
					    }
			        }
			    	if(s==1) {
			    	continue;
				    }
			    for(int i=0;i<stickLengths.length;i++) {
			    	for(int j=i+1;j<stickLengths.length;j++) {
			    		for(int k=j+1;k<stickLengths.length;k++) {
			    			for(int l=k+1;l<stickLengths.length;l++) {
			    				for(int m=l+1;m<stickLengths.length;m++) {		
			    					for(int n=m+1;n<stickLengths.length;n++) {	
			    						for(int o=n+1;o<stickLengths.length;o++) {
			    							for(int p=o+1;p<stickLengths.length;p++) {
			    				                 if(stickLengths[i]+stickLengths[j]+stickLengths[k]+
			    				                		 stickLengths[l]+stickLengths[m]+stickLengths[n]+stickLengths[o]+stickLengths[p]==target) {
			    				                        System.out.println(stickLengths[i]+"+"+stickLengths[j]+"+"+
			    				                		 stickLengths[k]+"+"+stickLengths[l]+"+"+stickLengths[m]+"+"+stickLengths[n]+"+"+stickLengths[o]
			    						                        +"+"+stickLengths[p]+"="+target);
			    				  s=1;break;
			    				                   }
						 		    			}
						 		    		}
						 		    	}
						 		    }
						        }
						    }
				        }
			        }
			    	if(s==1) {
			    	continue;
				    }
			    for(int i=0;i<stickLengths.length;i++) {
		    		for(int j=i+1;j<stickLengths.length;j++) {
		    			for(int k=j+1;k<stickLengths.length;k++) {
		    				for(int l=k+1;l<stickLengths.length;l++) {
		    					for(int m=l+1;m<stickLengths.length;m++) {		
		    						for(int n=m+1;n<stickLengths.length;n++) {	
		    							for(int o=n+1;o<stickLengths.length;o++) {
		    								for(int p=o+1;p<stickLengths.length;p++) {
		    									for(int q=p+1;q<stickLengths.length;q++) {
		    				                            if(stickLengths[i]+stickLengths[j]+stickLengths[k]+
		    				                            		stickLengths[l]+stickLengths[m]+stickLengths[n]+stickLengths[o]+stickLengths[p]+stickLengths[q]==target) {
		    				                                   System.out.println(stickLengths[i]+"+"+stickLengths[j]+"+"+stickLengths[k]+"+"+stickLengths[l]+"+"+stickLengths[m]+
		    				                                		   "+"+stickLengths[n]+"+"+stickLengths[o]+"+"+stickLengths[p]+"+"+stickLengths[q]+"="+target);
		    	                  s=1;break;
		    				                   }
					 		    			}
					 		    		}
					 		    	}
					 		    } 
					        } 
					    }  
			        }  
		        }
		     }
			    if(s==1) {
			    continue;
			    }
			    if(s==0) {
			    	System.out.println(target+"not matches");
			    } 
	          }
			}
           }
		