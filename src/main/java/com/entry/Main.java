package com.entry;


import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

import org.hibernate.query.Query;

import com.CarrierPath.Back_End_Development;
import com.CarrierPath.Front_End_Development;
import com.CarrierPath.Full_Stack_Java_Development;
import com.CarrierPath.Full_Stack_Web_Development;
import com.CarrierPath.Mean_Stack;
import com.CarrierPath.Mern_Stack;
import com.Exceptions.ContactNotFoundException;
import com.Exceptions.CourseNotFoundException;
import com.Exceptions.InvalidInputTakenException;
import com.Exceptions.UserNotFoundException;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Main 
{
	public  static void main(String[] args)
	{
		EntityManagerFactory emf=null;
		EntityManager em=null;
		EntityTransaction et=null;
		
		int choice = 0 ;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("|*******************************************************| WELCOME TO CARRIER-GUIDE APP |***************************************************************|");
		System.out.println("");
		System.out.println("");
		System.out.println("\t\t\t\t\t |--> A COMPLETE PREPARATION GUIDE FOR YOUR CODING INTERVIEW <--| \r\n\n"
				+ "\t\t\t\t\t    🥰🥰🥰  Preparation Is The Key For Success !!!  🥰🥰🥰\r\n");		
		System.out.println("\t\t\t\t\t\t 👌👉 Enjoy The #RightWay To Learn Coding 👈👌");
			 
		do 
		{
			System.out.println("");	
			System.out.println("");
			System.out.println("|*************************************************|❤❤❤❤❤|  LOGIN/SIGNUP MENU  |❤❤❤❤❤|**********************************************************|");
			System.out.println("");
			System.out.println("");
			System.out.println("\t\t --> Please Select From The Given Options Below : ");
			System.out.println("");
			System.out.println("\t\t 1- SIGN-UP \t\t 2- LOG-IN \t\t 3- FORGOT - USERNAME OR PASSWORD \t\t 4- EXIT");
			System.out.print("\n\t\t USERS CHOICE : ");
			choice = sc.nextInt();
			sc.nextLine();
					
			if(choice==1)
			{
				System.out.println("");
				System.out.println("|-------------------------------------------------------------- SIGN-UP PROCESS ----------------------------------------------------------------------|");
				System.out.println("");
				String fname ;
				String lname ;
				String username ;
				String password ;
				String dob ;
				String email ;
				String phoneno ;
				String degree ;
				String branch ;
				String collegename ;
				String passoutyear ; 
				System.out.println("");
							
				System.out.print("\t\t 1- First Name : ");
				fname = sc.nextLine();
				try 
				{
					boolean isValidFname = Pattern.matches("[a-zA-Z][a-zA-Z ]+", fname);
					if(isValidFname)
					{
						
					}
					else
					{
						throw new InvalidInputTakenException();
					}
				} 
				catch (InvalidInputTakenException iite) 
				{
					System.out.println("");
					System.out.println("|*****************************************************************************************************************************************************|");
					System.out.println("");
					System.out.println("");
					System.out.println("\t\t EXCEPTION TYPE : "+iite);
					System.out.println("");
					System.out.println("");
					System.out.print("\t\t ENTER ANY KEY TO GO MAIN MENU : ");
					String opt = sc.nextLine();
					System.out.println("");
					continue;
				}
			
				System.out.println("");

				System.out.print("\t\t 2- Last Name : ");
				lname = sc.nextLine();
				try 
				{
					boolean isValidLname = Pattern.matches("[a-zA-Z][a-zA-Z ]+", lname);
					if(isValidLname)
					{
					
					}
					else
					{
						throw new InvalidInputTakenException();
					}
				} 
				catch (InvalidInputTakenException iite) 
				{
					System.out.println("");
					System.out.println("|*****************************************************************************************************************************************************|");
					System.out.println("");
					System.out.println("");
					System.out.println("\t\t EXCEPTION TYPE : "+iite);
					System.out.println("");
					System.out.println("");
					System.out.print("\t\t ENTER ANY KEY TO GO MAIN MENU : ");
					String opt = sc.nextLine();
					System.out.println("");
					continue;
				}
	
				System.out.println("");
					
				System.out.print("\t\t 3- User-Name : ");
				username = sc.nextLine();
				System.out.println("");
				
				System.out.println("");
				System.out.println("\t\t --> PASSWORD IN THE FORMAT GIVEN BELOW : \r\n"
								 + "\r\n"
								 + "\t\t - At least 8 characters, max of 12\r\n"
								 + "\t\t - At least one uppercase\r\n"
								 + "\t\t - At least one lowercase\r\n"
								 + "\t\t - At least one number\r\n"
								 + "\t\t - At least one symbol @#$%=:?");
			
				System.out.println("");
				
				System.out.print("\t\t 4- Password : ");
				password = sc.nextLine();
				try 
				{
					boolean isValidPass = Pattern.matches("((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%=:\\?]).{8,20})", password);
					if(isValidPass)
					{
							
					}
					else
					{
						throw new InvalidInputTakenException();
					}
				} 
				catch (InvalidInputTakenException iite) 
				{
					System.out.println("");
					System.out.println("|*****************************************************************************************************************************************************|");
					System.out.println("");
					System.out.println("");
					System.out.println("\t\t EXCEPTION TYPE : "+iite);
					System.out.println("");
					System.out.println("");
					System.out.print("\t\t ENTER ANY KEY TO GO MAIN MENU : ");
					String opt = sc.nextLine();
					System.out.println("");
					continue;
				}
				
				System.out.println("");
						
				System.out.print("\t\t 5- Date Of Birth (dd-mm-yyyy) : ");
				dob = sc.nextLine();
				try 
				{
					boolean isValidDob = Pattern.matches("[0123]\\d-[01]*[012]-\\d{4}", dob);
					if(isValidDob)
					{
							
					}
					else
					{
						throw new InvalidInputTakenException();
					}
				} 
				catch (InvalidInputTakenException iite) 
				{
					System.out.println("");
					System.out.println("|*****************************************************************************************************************************************************|");
					System.out.println("");
					System.out.println("");
					System.out.println("\t\t EXCEPTION TYPE : "+iite);
					System.out.println("");
					System.out.println("");
					System.out.print("\t\t ENTER ANY KEY TO GO MAIN MENU : ");
					String opt = sc.nextLine();
					System.out.println("");
					continue;
				}
		
				System.out.println("");
					
				System.out.print("\t\t 6- Email-ID : ");
				email = sc.nextLine();
				try 
				{
					boolean isValidEmail = Pattern.matches("([^A-Z].+)@(.+)", email);
					if(isValidEmail)
					{
							
					}
					else
					{
						throw new InvalidInputTakenException();
					}
				} 
				catch (InvalidInputTakenException iite) 
				{
					System.out.println("");
					System.out.println("|*****************************************************************************************************************************************************|");
					System.out.println("");
					System.out.println("");
					System.out.println("\t\t EXCEPTION TYPE : "+iite);
					System.out.println("");
					System.out.println("");
					System.out.print("\t\t ENTER ANY KEY TO GO MAIN MENU : ");
					String opt = sc.nextLine();
					System.out.println("");
					continue;
				}
				
				System.out.println("");
					
				System.out.print("\t\t 7- Contact : +91-");
				phoneno = sc.nextLine();
				try 
				{
					boolean isValidContact = Pattern.matches("^\\d{10}$", phoneno);
					if(isValidContact)
					{
							
					}
					else
					{
						throw new InvalidInputTakenException();
					}
				} 
				catch (InvalidInputTakenException iite) 
				{
					System.out.println("");
					System.out.println("|*****************************************************************************************************************************************************|");
					System.out.println("");
					System.out.println("");
					System.out.println("\t\t EXCEPTION TYPE : "+iite);
					System.out.println("");
					System.out.println("");
					System.out.print("\t\t ENTER ANY KEY TO GO MAIN MENU : ");
					String opt = sc.nextLine();
					System.out.println("");
					continue;
				}
			
				System.out.println("");
		
				System.out.print("\t\t 8- Degree (N/A If Not Exist) : ");
				degree = sc.nextLine();
			
				System.out.println("");
						
				System.out.print("\t\t 9- Branch (N/A If Not Exist) : ");
				branch = sc.nextLine();
		
				System.out.println("");
					
				System.out.print("\t\t 10- College Name : ");
				collegename = sc.nextLine();
		
				System.out.println("");
					
				System.out.print("\t\t 11- Passout Year : ");
				passoutyear = sc.nextLine();
	
				System.out.println("");
				 			
				Signup_Process signup = new Signup_Process( fname,  lname,  username,  password,  dob,  email, phoneno,  degree,  branch,  collegename,  passoutyear);
								
				try
				{
					emf=Persistence.createEntityManagerFactory("project");
					em=emf.createEntityManager();
					et=em.getTransaction();
					et.begin();
						
					Signup_Process sp = new Signup_Process();
					sp.setFname(signup.getFname());
					sp.setLname(signup.getLname());
					sp.setUsername(signup.getUsername());
					sp.setPassword(signup.getPassword());
					sp.setDob(signup.getDob());
					sp.setEmail(signup.getEmail());
					sp.setPhoneno(signup.getPhoneno());
					sp.setDegree(signup.getDegree());
					sp.setBranch(signup.getBranch());
					sp.setCollegename(signup.getCollegename());
					sp.setPassoutyear(signup.getPassoutyear());
					em.persist(sp);
					et.commit();		
				}
				catch(Exception e)
				{
					et.rollback();
				}
				finally
				{
					em.close();
					emf.close();
				}
				 
				System.out.println("");
				System.out.println("|*****************************************************************************************************************************************************|");
				System.out.println("");
				System.out.println("\t\t\t\t\t\t CONGRATULATIONS ❤❤❤ ");
				System.out.println("\t\t\t\t\t\t SIGN-UP PROCESS DONE SUCCESSFULLY !!!");
				System.out.println("");
				System.out.println("|*****************************************************************************************************************************************************|");
				System.out.println("");
				System.out.println("");
				System.out.print("\t\t ENTER ANY KEY TO GO MAIN MENU : ");
				String opt = sc.nextLine();
				System.out.println("");
	
			}
				
			
			else if(choice==2)
			{
				System.out.println("");
				System.out.println("|-------------------------------------------------------------- LOG-IN PROCESS -----------------------------------------------------------------------|");
				System.out.println("");
				String username ;
				String password ;
				System.out.println("");
				
				System.out.print("\t\t 1- User-Name : ");
				username = sc.nextLine();
				System.out.println("");
				System.out.print("\t\t 2- Password : ");
				password = sc.nextLine();
				System.out.println("");
				 
				Login_Process login = new Login_Process(username , password);
				
				try
				{
					String user = login.getUsername();
					String pass = login.getPassword();
				 
					emf=Persistence.createEntityManagerFactory("project");
					em=emf.createEntityManager();
					et=em.getTransaction();
					et.begin();
						
					Query query=(Query) em.createQuery("from Signup_Process where username=:username and password=:password");
					query.setParameter("username", user);
				    query.setParameter("password", pass);
					Signup_Process q=(Signup_Process)query.uniqueResult();
					                   
					if(q!=null) 
					{
						System.out.println("");
						System.out.println("|*****************************************************************************************************************************************************|");
						System.out.println("");
						System.out.println("\t\t\t\t\t\t\t CONGRATULATIONS ❤❤❤ ");
						System.out.println("\t\t\t\t\t\t\t LOG-IN SUCCESSFULLY !!!");
						System.out.println("");
						System.out.println("|*****************************************************************************************************************************************************|");
						System.out.println("");
						System.out.println("");
						System.out.println("");
							
						do
						{
							System.out.println("");	
							System.out.println("");
							System.out.println("|*****************************************************|❤❤❤❤❤|  MAIN MENU  |❤❤❤❤❤|*************************************************************|");
							System.out.println("");
							System.out.println("");
							System.out.println("\t\t\t\t\t\t      This is what exactly this guide \r\n"
									+ "\t\t\t\t\t\t\t     will help you with.\r\n"
									+ "\t\t\t\t\t\t We have curated a complete preparation guide \r\n"
									+ "\t\t\t\t\t\t for you to prepare in a structured manner. \r\n"
									+ "\t\t\t\t\t\t\t    Choose your tracks \r\n"
									+ "\t\t\t\t\t\t\t\t    and \r\n"
									+ "\t\t\t\t\t\t start preparing for your next big interview. \r\n"
									+ "\t\t\t\t\t\t\t  Prepare for companies like :\r\n"
									+ "\t\t\t\t\t\t\t\t|--> MAANG <--|");
							System.out.println("");
							System.out.println("");
							System.out.println("");
						
							System.out.println("\t\t --> Please Select From The Given Options Below : ");
							System.out.println("");
						
							System.out.println("\t\t 1- CARRIER OPPORTUNITY \t\t 2- PROFILE \t\t 3- CONTACT US \t\t 4- VIEW YOUR QUERIES \t\t 999- LOG-OUT");
						
							System.out.print("\n\t\t USERS CHOICE : ");
							choice = sc.nextInt();
							sc.nextLine();
							
							if(choice == 1)
							{
							
								do
								{
									System.out.println("");	
									System.out.println("");
									System.out.println("|***************************************************|❤❤❤❤❤|  CARRIER OPPORTUNITY  |❤❤❤❤❤|******************************************************|");
									System.out.println("");
									System.out.println("");
									System.out.println("");
								
									System.out.println("\t\t --> Please Select From The Given Course Below In Which You Want To Make Carrier : ");
									System.out.println("");
									System.out.println("");
								
									System.out.println("\t\t 1- FULL STACK JAVA DEVELOPER \t\t 2- FULL STACK WEB DEVELOPER \t\t 3- FRONT-END DEVELOPER \n\n\t\t 4- BACK-END DEVELOPER  \t\t 5- MEAN STACK \t\t\t\t 6- MERN-STACK \n\n\t\t\t\t\t\t\t 99- GO TO MAIN MENU");
									System.out.print("\n\n\t\t USERS CHOICE : ");
									choice = sc.nextInt();
									sc.nextLine();
								
									try
									{
										String opt ;
									
										switch(choice)
										{
											case 1 :
													
													while(choice!=9)
													{
														System.out.println("");
														System.out.println("|******************************************|❤❤❤❤❤| FULL STACK JAVA DEVELOPMENT CARRIER PATH |❤❤❤❤❤|********************************************|");
														System.out.println("");
														System.out.println("");
														System.out.println("\t\t 1- ABOUT \t 2- JOURNEY TOWARDS FULL STACK JAVA DEVELOPER \t 3- CARRIER OPPORTUNITY \t 4- SELF LEARNING WEBSITES \t 9- GO TO CARRIER OPPORTUNITY");
														System.out.println("");
														System.out.print("\t\t User Choice : ");
														choice = sc.nextInt();
														sc.nextLine();
												
														switch(choice)
														{
															case 1 :
																	Full_Stack_Java_Development.About();
																	break;
															case 2 :
																	Full_Stack_Java_Development.Journey();
																	break;
															case 3 :
																	Full_Stack_Java_Development.Opportunity();
																	break;
															case 4 :
																	Full_Stack_Java_Development.SelfLearn();
																	break;
															case 9 :
																	break;
															default :
																	System.out.println("");
																	System.out.println("\t\t\t\t\t\t\t|***********|  INVALID CHOICE  |***********| ");
																	System.out.println("\t\t\t\t\t\t\t|***********| PLEASE TRY AGAIN |***********|");
																	System.out.println("");
																	break;
														}
												
														if(choice !=9)
														{
															System.out.println("");
															System.out.print("\t\t ENTER ANY KEY TO GO FULL STACK JAVA DEVELOPMENT CARRIER PATH  : ");
															opt = sc.nextLine();
															System.out.println("");
														}
													}
												
													System.out.println("");
												
													if(choice !=9)
													{
														System.out.println("");
														System.out.print("\t\t ENTER ANY KEY TO GO CARRIER OPPORTUNITY : ");
														opt = sc.nextLine();
														System.out.println("");
													}
													break;
									 
											case 2 :
												
													while(choice!=9)
													{
														System.out.println("");
														System.out.println("|*******************************************|❤❤❤❤❤| FULL STACK WEB DEVELOPMENT CARRIER PATH |❤❤❤❤❤|********************************************|");
														System.out.println("");
														System.out.println("");
														
														System.out.println("\t\t 1- ABOUT \t 2- JOURNEY TOWARDS FULL STACK WEB DEVELOPER \t 3- CARRIER OPPORTUNITY \t 4- SELF LEARNING WEBSITES \t 9- GO TO CARRIER OPPORTUNITY");
														System.out.println("");
														System.out.print("\t\t User Choice : ");
														choice = sc.nextInt();
														sc.nextLine();
												
														switch(choice)
														{
									 				
															case 1 :
																	Full_Stack_Web_Development.About();
																	break;
									 							
															case 2 :
																	Full_Stack_Web_Development.Journey();
																	break;
																	
															case 3 :
																	Full_Stack_Web_Development.Opportunity();
																	break;
									 							
															case 4 :
																	Full_Stack_Web_Development.SelfLearn();
																	break;
									 							
															case 9 :
																	break;
									 							
															default :
																	System.out.println("");
																	System.out.println("\t\t\t\t\t\t\t|***********|  INVALID CHOICE  |***********| ");
																	System.out.println("\t\t\t\t\t\t\t|***********| PLEASE TRY AGAIN |***********|");
																	System.out.println("");
																	break;
																	
														}
												
														if(choice !=9)
														{
															System.out.println("");
															System.out.print("\t\t ENTER ANY KEY TO GO FULL STACK WEB DEVELOPMENT CARRIER PATH  : ");
															opt = sc.nextLine();
															System.out.println("");
														}
													}
													System.out.println("");
												
													if(choice !=9)
													{
														System.out.println("");
														System.out.print("\t\t ENTER ANY KEY TO GO CARRIER OPPORTUNITY : ");
														opt = sc.nextLine();
														System.out.println("");
													}
													break;
									 
									 
											case 3 :
													
													while(choice!=9)
													{
														System.out.println("");
														System.out.println("|******************************************|❤❤❤❤❤|    FRONT-END DEVELOPMENT CARRIER PATH    |❤❤❤❤❤|********************************************|");
														System.out.println("");
														System.out.println("");
														System.out.println("\t\t 1- ABOUT \t 2- JOURNEY TOWARDS FRONT-END DEVELOPER \t 3- CARRIER OPPORTUNITY \t 4- SELF LEARNING WEBSITES \t 9- GO TO CARRIER OPPORTUNITY");
														System.out.println("");
														System.out.print("\t\t User Choice : ");
														choice = sc.nextInt();
														sc.nextLine();
												
														switch(choice)
														{
															case 1 :
																	Front_End_Development.About();
																	break;
									 							
															case 2 :
																	Front_End_Development.Journey();
																	break;
									 							
															case 3 :
																	Front_End_Development.Opportunity();
																	break;
									 							
															case 4 :
																	Front_End_Development.SelfLearn();
																	break;
									 							
															case 9 :
																	break;
									 							
															default :
																	System.out.println("");
																	System.out.println("\t\t\t\t\t\t\t|***********|  INVALID CHOICE  |***********| ");
																	System.out.println("\t\t\t\t\t\t\t|***********| PLEASE TRY AGAIN |***********|");
																	System.out.println("");
																	break;
		
														}
									 				
														if(choice !=9)
														{
															System.out.println("");
															System.out.print("\t\t ENTER ANY KEY TO GO FRONT-END DEVELOPMENT CARRIER PATH  : ");
															opt = sc.nextLine();
															System.out.println("");
														}
													}
												
													System.out.println("");
												
													if(choice !=9)
													{
														System.out.println("");
														System.out.print("\t\t ENTER ANY KEY TO GO CARRIER OPPORTUNITY : ");
														opt = sc.nextLine();
														System.out.println("");
													}
													break;
									 
									 
												case 4 :
												
													while(choice!=9)
													{
								
														System.out.println("");
														System.out.println("|*******************************************|❤❤❤❤❤|    BACK-END DEVELOPMENT CARRIER PATH    |❤❤❤❤❤|********************************************|");
														System.out.println("");
														System.out.println("");
														System.out.println("\t\t 1- ABOUT \t 2- JOURNEY TOWARDS BACK-END DEVELOPER \t 3- CARRIER OPPORTUNITY \t 4- SELF LEARNING WEBSITES \t 9- GO TO CARRIER OPPORTUNITY");
														System.out.println("");
														System.out.print("\t\t User Choice : ");
														choice = sc.nextInt();
														sc.nextLine();
												
														switch(choice)
														{
									 						case 1 :
									 								Back_End_Development.About();
									 								break;
									 							
									 						case 2 :
									 								Back_End_Development.Journey();
									 								break;
									 							
									 						case 3 :
									 								Back_End_Development.Opportunity();
									 								break;
									 							
									 						case 4 :
									 								Back_End_Development.SelfLearn();
									 								break;
									 							
									 						case 9 :
									 								break;
									 							
									 						default :
									 								System.out.println("");
									 								System.out.println("\t\t\t\t\t\t\t|***********|  INVALID CHOICE  |***********| ");
									 								System.out.println("\t\t\t\t\t\t\t|***********| PLEASE TRY AGAIN |***********|");
									 								System.out.println("");
									 								break;
		
														}
									 				
														if(choice !=9)
														{
															System.out.println("");
															System.out.print("\t\t ENTER ANY KEY TO GO BACK DEVELOPMENT CARRIER PATH  : ");
															opt = sc.nextLine();
															System.out.println("");
														}
													}
													System.out.println("");
												
													if(choice !=9)
													{
														System.out.println("");
														System.out.print("\t\t ENTER ANY KEY TO GO CARRIER OPPORTUNITY : ");
														opt = sc.nextLine();
														System.out.println("");
													}
													break;
									 
										 			
												case 5 :
													
													while(choice!=9)
													{
														System.out.println("");
														System.out.println("|*************************************************|❤❤❤❤❤| MEAN STACK CARRIER PATH |❤❤❤❤❤|*******************************************************|");
														System.out.println("");
														System.out.println("");
														System.out.println("\t\t 1- ABOUT \t 2- JOURNEY TOWARDS MEAN STACK DEVELOPER \t 3- CARRIER OPPORTUNITY \t 4- SELF LEARNING WEBSITES \t 9- GO TO CARRIER OPPORTUNITY");
														System.out.println("");
														System.out.print("\t\t User Choice : ");
														choice = sc.nextInt();
														sc.nextLine();
												
														switch(choice)
														{
															case 1 :
																	Mean_Stack.About();
																	break;
									 							
															case 2 :
																	Mean_Stack.Journey();
																	break;
									 							
															case 3 :
																	Mean_Stack.Opportunity();
																	break;
									 							
															case 4 :
																	Mean_Stack.SelfLearn();
																	break;
									 							
															case 9 :
																	break;
									 							
															default :
																	System.out.println("");
																	System.out.println("\t\t\t\t\t\t\t|***********|  INVALID CHOICE  |***********| ");
																	System.out.println("\t\t\t\t\t\t\t|***********| PLEASE TRY AGAIN |***********|");
																	System.out.println("");
																	break;
		
														}
												
														if(choice !=9)
														{
															System.out.println("");
															System.out.print("\t\t ENTER ANY KEY TO GO MEAN STACK CARRIER PATH  : ");
															opt = sc.nextLine();
															System.out.println("");
														}
													}
													System.out.println("");
												
													if(choice !=9)
													{
														System.out.println("");
														System.out.print("\t\t ENTER ANY KEY TO GO CARRIER OPPORTUNITY : ");
														opt = sc.nextLine();
														System.out.println("");
													}
													break;
									 
									 
												case 6 :
										 	
													while(choice!=9)
													{
														System.out.println("");
														System.out.println("|*************************************************|❤❤❤❤❤| MERN STACK CARRIER PATH |❤❤❤❤❤|*******************************************************|");
														System.out.println("");
														System.out.println("");
														System.out.println("\t\t 1- ABOUT \t 2- JOURNEY TOWARDS MERN STACK DEVELOPER \t 3- CARRIER OPPORTUNITY \t 4- SELF LEARNING WEBSITES \t 9- GO TO CARRIER OPPORTUNITY");
														System.out.println("");
														System.out.print("\t\t User Choice : ");
														choice = sc.nextInt();
														sc.nextLine();
												
														switch(choice)
														{
										 					case 1 :
										 							Mern_Stack.About();
										 							break;
										 						
										 					case 2 :
										 							Mern_Stack.Journey();
										 							break;
										 						
										 					case 3 :
										 							Mern_Stack.Opportunity();
										 							break;
										 						
										 					case 4 :
										 							Mern_Stack.SelfLearn();
										 							break;
										 						
										 					case 9 :
										 							break;
										 						
										 					default :
										 							System.out.println("");
										 							System.out.println("\t\t\t\t\t\t\t|***********|  INVALID CHOICE  |***********| ");
										 							System.out.println("\t\t\t\t\t\t\t|***********| PLEASE TRY AGAIN |***********|");
										 							System.out.println("");
										 							break;
		
														}
										 		
														if(choice !=9)
														{
															System.out.println("");
															System.out.print("\t\t ENTER ANY KEY TO GO MERN STACK CARRIER PATH  : ");
															opt = sc.nextLine();
															System.out.println("");
														}
													}
													System.out.println("");
												
													if(choice !=9)
													{
														System.out.println("");
														System.out.print("\t\t ENTER ANY KEY TO GO CARRIER OPPORTUNITY : ");
														opt = sc.nextLine();
														System.out.println("");
													}
													break;
									 
												case 99 :
														System.out.println("");
														System.out.println("");
														break;
									 
												default :
														System.out.println("");
														System.out.println("\t\t\t\t\t\t\t|***********|  INVALID CHOICE  |***********| ");
														System.out.println("\t\t\t\t\t\t\t|***********| PLEASE TRY AGAIN |***********|");
														System.out.println("");
														throw new CourseNotFoundException();

										}
									}
								
									catch (CourseNotFoundException cnfe) 
									{
										System.out.println("");
										System.out.println("|*****************************************************************************************************************************************************|");
										System.out.println("");
										System.out.println("");
										System.out.println("\t\t\t\t\t\t\t EXCEPTION TYPE : "+cnfe);
										System.out.println("");
										System.out.print("\t\t\t\t\t\t\t ENTER ANY KEY TO GO CARRIER OPPORTUNITY : ");
										String opt = sc.nextLine();
										System.out.println("");
									} 
								 	
								}
							
								while(choice != 99);
								continue;	 
							}
						
						
							else if(choice == 2)
							{
								System.out.println("");
								System.out.println("");
								System.out.println("\t\t\t\t --> Please Select From The Given Options Below :  ");
								System.out.println("");
								System.out.println("");
								System.out.println("\t\t\t 1- VIEW PROFILE \t\t\t\t 2- UPDATE PROFILE");
								System.out.println("");
								System.out.println("");
								System.out.print("\t\t USER CHOICE : ");
								int ch = sc.nextInt();
								sc.nextLine();
							
								if(ch == 1)
								{
								// View Profile ...
									
									System.out.println("");	
									String phoneno ;
									System.out.println("");
									System.out.print("\t\t Contact : +91-");
									phoneno = sc.nextLine();
									Signup_Process contact = new Signup_Process(phoneno);
								
									try
									{		
										String con = contact.getPhoneno();	
										emf=Persistence.createEntityManagerFactory("project");
										em=emf.createEntityManager();
										et=em.getTransaction();
										et.begin();
											
										Query qu =(Query) em.createQuery("from Signup_Process where phoneno=:con");
										qu.setParameter("con", phoneno);
										Signup_Process check =(Signup_Process)qu.uniqueResult();
										Signup_Process e1=em.find(Signup_Process.class, phoneno); 

										if(check!=null) 
										{
													
											System.out.println("");
											System.out.println("|*****************************************************************************************************************************************************|");
											System.out.println("");
											System.out.println("\t\t\t\t\t\t\t|***********|  YOUR - PROFILE  |***********| ");
											System.out.println("");
											System.out.println("");
											 		
											System.out.print("\t\t\t\t\t\t\t 1- First Name : "+ e1.getFname());
											System.out.println("");
											System.out.print("\t\t\t\t\t\t\t 2- Last Name : "+ e1.getLname());
											System.out.println("");
											System.out.print("\t\t\t\t\t\t\t 3- Date Of Birth : "+ e1.getDob());
											System.out.println("");
											System.out.print("\t\t\t\t\t\t\t 4- Email-ID : "+ e1.getEmail());
											System.out.println("");
											System.out.print("\t\t\t\t\t\t\t 5- Contact : "+ e1.getPhoneno());
											System.out.println("");
											System.out.print("\t\t\t\t\t\t\t 6- User Name : "+ e1.getUsername());
											System.out.println("");
											System.out.print("\t\t\t\t\t\t\t 7- User Password : "+ e1.getPassword());
											System.out.println("");
											System.out.print("\t\t\t\t\t\t\t 8- Branch : "+ e1.getBranch());
											System.out.println("");
											System.out.print("\t\t\t\t\t\t\t 9- Degree : "+ e1.getDegree());
											System.out.println("");
											System.out.print("\t\t\t\t\t\t\t 10- College Name : "+ e1.getCollegename());
											System.out.println("");
											System.out.print("\t\t\t\t\t\t\t 11- Passout Year : "+ e1.getPassoutyear());
											System.out.println("");
											System.out.println("");
											System.out.println("");
											System.out.print("\t\t ENTER ANY KEY TO GO MAIN MENU : ");
											String opt2 = sc.nextLine();
											System.out.println("");
											continue;
										 			
										}
									
										else
										{
											throw new ContactNotFoundException();
										}

									}
								
									catch(ContactNotFoundException cnfe)
									{
										System.out.println("");
										System.out.println("|*****************************************************************************************************************************************************|");
										System.out.println("");
										System.out.println("");
										System.out.println("");
										System.out.println("\t\t EXCEPTION TYPE : "+cnfe);
										System.out.println("");
										System.out.println("");
										System.out.println("");
										System.out.print("\t\t ENTER ANY KEY TO GO MAIN MENU : ");
										String opt1 = sc.nextLine();
										System.out.println("");
									}
			
									System.out.println("");
									System.out.println("");
									System.out.println("");
								
								}
									
								else if(ch == 2)
								{	
									System.out.println("");
									String phoneno ;
									System.out.println("");
									System.out.print("\t\t Contact : +91-");
									phoneno = sc.nextLine();
									Signup_Process contact = new Signup_Process(phoneno);
								
									try
									{
										String firstname = contact.getFname();
										String lastname = contact.getLname();
										String dateofbirth = contact.getDob();
										String branch = contact.getBranch();
										String email_id = contact.getEmail();
										String degree = contact.getDegree();
										String collegename = contact.getCollegename();
										String passoutyear = contact.getPassoutyear();
										String con = contact.getPhoneno();
						
										emf=Persistence.createEntityManagerFactory("project");
										em=emf.createEntityManager();
										et=em.getTransaction();
										et.begin();
										
										Query qu =(Query) em.createQuery("from Signup_Process where phoneno=:con");
										qu.setParameter("con", phoneno);
										Signup_Process check =(Signup_Process)qu.uniqueResult();
									           
										if(check!=null) 
										{
											
											System.out.println("");
											System.out.println("|*****************************************************************************************************************************************************|");
											System.out.println("");
											System.out.println("\t\t\t\t\t\t\t|***********|  UPDATE - PROFILE  |***********| ");
											System.out.println("");
											System.out.println("");
											System.out.println("\t\t\t\t --> Please Select From The Given Options Below :  ");
											System.out.println("");
										
											System.out.println("\t\t\t 1- First Name    \t\t\t 2- Last Name    \t\t\t 3- Date Of Birth");
											System.out.println("");
											System.out.println("\t\t\t 4- Email-ID      \t\t\t 5- Contact      \t\t\t 6- Degree");
											System.out.println("");
											System.out.println("\t\t\t 7- Branch        \t\t\t 8- College Name \t\t\t 9-Passout Year");
											System.out.println("");
											System.out.println("\t\t\t                  \t\t\t 10- GO TO MAIN MENU");
											System.out.println("");
											System.out.println("");
											System.out.print("\t\t USERS CHOICE : ");
											choice = sc.nextInt();
											sc.nextLine();
										 		
											switch(choice)
											{
												case 1:
														System.out.println("");
														System.out.print("\t\t Updated First Name : ");
														String fname = sc.nextLine();
														Query fn = (Query) em.createQuery("update Signup_Process set fname=:firstname where phoneno=:con");
														fn.setParameter("firstname", fname);
														fn.setParameter("con", phoneno);
														fn.executeUpdate(); 
												
														System.out.println("");
														System.out.println("");
														System.out.println("|*****************************************************************************************************************************************************|");
														System.out.println("");
														System.out.println("\t\t\t\t\t\t Congratulations First Name Is Updated");
														System.out.println("");
														System.out.println("|*****************************************************************************************************************************************************|");
														System.out.println("");
														System.out.println("");
												
														System.out.print("\t\t ENTER ANY KEY TO GO MAIN MENU : ");
														String opt1 = sc.nextLine();
														System.out.println("");
														et.commit();
														break;
										 			
												case 2:
														System.out.println("");
														System.out.print("\t\t Updated Last Name : ");
														String lname = sc.nextLine();
														Query fn1 = (Query) em.createQuery("update Signup_Process set lname=:lastname where phoneno=:con");
														fn1.setParameter("lastname", lname);
														fn1.setParameter("con", phoneno);
														fn1.executeUpdate(); 
												
														System.out.println("");
														System.out.println("");
														System.out.println("|*****************************************************************************************************************************************************|");
														System.out.println("");
														System.out.println("\t\t\t\t\t\t Congratulations Last Name Is Updated");
														System.out.println("");
														System.out.println("|*****************************************************************************************************************************************************|");
														System.out.println("");
														System.out.println("");
												
														System.out.print("\t\t ENTER ANY KEY TO GO MAIN MENU : ");
														opt1 = sc.nextLine();
														System.out.println("");
														et.commit();
														continue;
										 			
												case 3:
														System.out.println("");
														System.out.print("\t\t Updated Date OF Birth : ");
														String dob = sc.nextLine();
														Query fn2 = (Query) em.createQuery("update Signup_Process set dob=:dateofbirth where phoneno=:con");
														fn2.setParameter("dateofbirth", dob);
														fn2.setParameter("con", phoneno);
														fn2.executeUpdate(); 
												
														System.out.println("");
														System.out.println("");
														System.out.println("|*****************************************************************************************************************************************************|");
														System.out.println("");
														System.out.println("\t\t\t\t\t\t Congratulations Date Of Birth Is Updated");
														System.out.println("");
														System.out.println("|*****************************************************************************************************************************************************|");
														System.out.println("");
														System.out.println("");
														
														System.out.print("\t\t ENTER ANY KEY TO GO MAIN MENU : ");
														opt1 = sc.nextLine();
														System.out.println("");
														et.commit();
														continue;
										 			                
												case 4:
														System.out.println("");
														System.out.print("\t\t Updated Email-ID : ");
														String emailid = sc.nextLine();
														Query fn3 = (Query) em.createQuery("update Signup_Process set email=:email_id where phoneno=:con");
														fn3.setParameter("email_id", emailid);
														fn3.setParameter("con", phoneno);
														fn3.executeUpdate(); 
												
														System.out.println("");
														System.out.println("");
														System.out.println("|*****************************************************************************************************************************************************|");
														System.out.println("");
														System.out.println("\t\t\t\t\t\t Congratulations Email-ID Is Updated");
														System.out.println("");
														System.out.println("|*****************************************************************************************************************************************************|");
														System.out.println("");
														System.out.println("");
												
														System.out.print("\t\t ENTER ANY KEY TO GO MAIN MENU : ");
														opt1 = sc.nextLine();
														System.out.println("");
														et.commit();
														continue;
										 			
												case 5:
														System.out.println("");
														System.out.print("\t\t Updated Contact : ");
														String phone = sc.nextLine();
														Query fn4 = (Query) em.createQuery("update Signup_Process set phoneno=:con where phoneno=:con");
														fn4.setParameter("con", phone);
														fn4.setParameter("con", phoneno);
														fn4.executeUpdate(); 
												
														System.out.println("");
														System.out.println("");
														System.out.println("|*****************************************************************************************************************************************************|");
														System.out.println("");
														System.out.println("\t\t\t\t\t\t Congratulations Contact Is Updated");
														System.out.println("");
														System.out.println("|*****************************************************************************************************************************************************|");
														System.out.println("");
														System.out.println("");
												
														System.out.print("\t\t ENTER ANY KEY TO GO MAIN MENU : ");
														opt1 = sc.nextLine();
														System.out.println("");
														et.commit();
														continue;
										 			
												case 6:
														System.out.println("");
														System.out.print("\t\t Updated Degree : ");
														String Cdegree = sc.nextLine();
														Query fn5 = (Query) em.createQuery("update Signup_Process set degree=:degree where phoneno=:con");
														fn5.setParameter("degree", Cdegree);
														fn5.setParameter("con", phoneno);
														fn5.executeUpdate(); 
												
														System.out.println("");
														System.out.println("");
														System.out.println("|*****************************************************************************************************************************************************|");
														System.out.println("");
														System.out.println("\t\t\t\t\t\t Congratulations Degree Is Updated");
														System.out.println("");
														System.out.println("|*****************************************************************************************************************************************************|");
														System.out.println("");
														System.out.println("");
												
														System.out.print("\t\t ENTER ANY KEY TO GO MAIN MENU : ");
														opt1 = sc.nextLine();
														System.out.println("");
														et.commit();
														continue;
										 			
												case 7:
														System.out.println("");
														System.out.print("\t\t Updated Branch : ");
														String Cbranch = sc.nextLine();
														Query fn6 = (Query) em.createQuery("update Signup_Process set branch=:branch where phoneno=:con");
														fn6.setParameter("branch", Cbranch);
														fn6.setParameter("con", phoneno);
														fn6.executeUpdate(); 
												
														System.out.println("");
														System.out.println("");
														System.out.println("|*****************************************************************************************************************************************************|");
														System.out.println("");
														System.out.println("\t\t\t\t\t\t Congratulations Branch Is Updated");
														System.out.println("");
														System.out.println("|*****************************************************************************************************************************************************|");
														System.out.println("");
														System.out.println("");
												
														System.out.print("\t\t ENTER ANY KEY TO GO MAIN MENU : ");
														opt1 = sc.nextLine();
														System.out.println("");
														et.commit();
														continue;
										 			
												case 8:
														System.out.println("");
														System.out.print("\t\t Updated College Name : ");
														String Cname = sc.nextLine();
														Query fn7 = (Query) em.createQuery("update Signup_Process set collegename=:collegename where phoneno=:con");
														fn7.setParameter("collegename", Cname);
														fn7.setParameter("con", phoneno);
														fn7.executeUpdate(); 
												
														System.out.println("");
														System.out.println("");
														System.out.println("|*****************************************************************************************************************************************************|");
														System.out.println("");
														System.out.println("\t\t\t\t\t\t Congratulations College Name Is Updated");
														System.out.println("");
														System.out.println("|*****************************************************************************************************************************************************|");
														System.out.println("");
														System.out.println("");
												
														System.out.print("\t\t ENTER ANY KEY TO GO MAIN MENU : ");
														opt1 = sc.nextLine();
														System.out.println("");
														et.commit();
														continue;
										 			
												case 9:
														System.out.println("");
														System.out.print("\t\t Updated Passout Year : ");
														String passout = sc.nextLine();
														Query fn8 = (Query) em.createQuery("update Signup_Process set passoutyear=:passoutyear where phoneno=:con");
														fn8.setParameter("passoutyear", passout);
														fn8.setParameter("con", phoneno);
														fn8.executeUpdate(); 
												
														System.out.println("");
														System.out.println("");
														System.out.println("|*****************************************************************************************************************************************************|");
														System.out.println("");
														System.out.println("\t\t\t\t\t\t Congratulations Pass-Out Year Is Updated");
														System.out.println("");
														System.out.println("|*****************************************************************************************************************************************************|");
														System.out.println("");
														System.out.println("");
												
														System.out.print("\t\t ENTER ANY KEY TO GO MAIN MENU : ");
														opt1 = sc.nextLine();
														System.out.println("");
														et.commit();
														continue;
										 			   
												case 10:
												
														break;
										 		
												default :
												
														try 
														{
															throw new InvalidInputTakenException();		
														}

														catch (InvalidInputTakenException iite)
														{
															System.out.println("");
															System.out.println("|*****************************************************************************************************************************************************|");
															System.out.println("");
															System.out.println("");
															System.out.println("");
															System.out.println("\t\t EXCEPTION TYPE : "+iite);
															System.out.println("");
															System.out.println("");
															System.out.println("");
													
															System.out.print("\t\t ENTER ANY KEY TO GO MAIN MENU : ");
															opt1 = sc.nextLine();
															System.out.println("");
														}
			 			
											}
											
										}
									
										else
										{
											throw new ContactNotFoundException();
										}
											
									}
								
									catch(ContactNotFoundException cnfe)
									{
										System.out.println("");
										System.out.println("|*****************************************************************************************************************************************************|");
										System.out.println("");
										System.out.println("");
										System.out.println("");
										System.out.println("\t\t EXCEPTION TYPE : "+cnfe);
										System.out.println("");
										System.out.println("");
										System.out.println("");
									
										System.out.print("\t\t ENTER ANY KEY TO GO MAIN MENU : ");
										String opt1 = sc.nextLine();
										System.out.println("");
						
									}
									
								}
							
								else
								{
									try 
									{
										throw new InvalidInputTakenException();
									} 
								
									catch (InvalidInputTakenException iite)
									{
										System.out.println("");
										System.out.println("|*****************************************************************************************************************************************************|");
										System.out.println("");
										System.out.println("");
										System.out.println("");
										System.out.println("\t\t EXCEPTION TYPE : "+iite);
										System.out.println("");
										System.out.println("");
										System.out.println("");
										
										System.out.print("\t\t ENTER ANY KEY TO GO MAIN MENU : ");
										String opt1 = sc.nextLine();
										System.out.println("");
									}
								}
									
							}
							
							
							else if(choice == 3)
							{
									// Contact Us
									
								String fullname ;
								String phoneno ;
								String email ;
								String place ;
								String message ;
									
								System.out.println("");	
								System.out.println("");
								System.out.println("|****************************************************|❤❤❤❤❤|  CONTACT US  |❤❤❤❤❤|*************************************************************|");
								System.out.println("");
								System.out.println("");
								System.out.println("");
							
								System.out.print("\t\t 1- Full Name : ");
								fullname = sc.nextLine();
								System.out.println("");
							
								System.out.print("\t\t 2- Email-ID : ");
								email = sc.nextLine();
								System.out.println("");
							
								System.out.print("\t\t 3- Contact : +91-");
								phoneno = sc.nextLine();
								System.out.println("");
							
								System.out.print("\t\t 4- Place : ");
								place = sc.nextLine();
								System.out.println("");
							
								System.out.print("\t\t 5- Query : ");
								message = sc.nextLine();
								System.out.println("");

								ContactUs contactus = new ContactUs(fullname , email , phoneno , place , message);
								
								try
								{
									String con = contactus.getPhoneno();
									
									emf=Persistence.createEntityManagerFactory("project");
									em=emf.createEntityManager();
									et=em.getTransaction();
									et.begin();
										
									Query qu =(Query) em.createQuery("from Signup_Process where phoneno=:con");
									qu.setParameter("con", phoneno);
									Signup_Process check =(Signup_Process)qu.uniqueResult();
								           
									if(check!=null) 
									{
										ContactUs cu = new ContactUs();
										cu.setFullname(contactus.getFullname());
										cu.setEmailid(contactus.getEmailid());
										cu.setPhoneno(contactus.getPhoneno());
										cu.setPlace(contactus.getPlace());
										cu.setMessage(contactus.getMessage());
										em.persist(cu);		
										et.commit();
									}
									
									else
									{
										throw new ContactNotFoundException();
									}
								}
								
								catch(ContactNotFoundException cnfe)
								{
									System.out.println("");
									System.out.println("|*****************************************************************************************************************************************************|");
									System.out.println("");
									System.out.println("");
									System.out.println("\t\t YOU MUST NEED TO ENTER REGISTERED CONTACT NUMBER !!!");
									System.out.println("");
									System.out.println("\t\t EXCEPTION TYPE : "+cnfe);
									System.out.println("");
									System.out.print("\t\t ENTER ANY KEY TO GO MAIN MENU : ");
									String opt = sc.nextLine();
									System.out.println("");
									continue;
								}
							
								catch(Exception e)
								{
									et.rollback();
								}
							
								finally
								{
									em.close();
									emf.close();
								}
								 
								System.out.println("");
								System.out.println("|*****************************************************************************************************************************************************|");
								System.out.println("");
								System.out.println("\t\t\t\t\t\t CONGRATULATIONS ❤❤❤ ");
								System.out.println("\t\t\t\t\t\t WE WILL CONTACT YOU SOON !!!");
								System.out.println("");
								System.out.println("|*****************************************************************************************************************************************************|");
								System.out.println("");
								System.out.println("");
							
								System.out.print("\t\t ENTER ANY KEY TO GO MAIN MENU : ");
								String opt = sc.nextLine();
								System.out.println("");
									
							}
							
							else if(choice == 4)
							{
								
								System.out.println("");
								String phoneno ;
								System.out.println("|*****************************************************************************************************************************************************|");
								System.out.println("");
								System.out.println("");
								System.out.print("\t\t Contact : +91-");
								phoneno = sc.nextLine();
								
								try
								{
									ContactUs contactus = new ContactUs();
									String con = contactus.getPhoneno();
									
									emf=Persistence.createEntityManagerFactory("project");
									em=emf.createEntityManager();
									et=em.getTransaction();
									et.begin();
									
									Query checkquery = (Query)em.createQuery("from Signup_Process where phoneno=:con");
									checkquery.setParameter("con", phoneno);
									
									Signup_Process check =(Signup_Process)checkquery.uniqueResult();							
									
									Query getquery = (Query)em.createQuery("from ContactUs where phoneno=:con");
									getquery.setParameter("con", phoneno);
									
									if(check!=null) 
									{
										
										List<ContactUs> empList = getquery.list();
										
										System.out.println("");	
										System.out.println("");
										System.out.println("|****************************************************|❤❤❤❤❤|  YOUR QUERY  |❤❤❤❤❤|*************************************************************|");
										System.out.println("");
										System.out.println("");
										
										for(ContactUs getissue : empList)
										{
											System.out.println("");
											System.out.println("");
											System.out.println("\t\t Unique-ID : "+getissue.getUniqueid()+"\n\t\t Query : "+getissue.getMessage());
											
										}
										
										System.out.println("");
										System.out.println("");
										System.out.print("\t\t ENTER ANY KEY TO GO MAIN MENU : ");
										String opt = sc.nextLine();
										System.out.println("");
									}
									
									else
									{
										throw new ContactNotFoundException();
									}
									
								}
								
								catch (ContactNotFoundException cnfe)
								{
									System.out.println("");
									System.out.println("|*****************************************************************************************************************************************************|");
									System.out.println("");
									System.out.println("");
									System.out.println("\t\t EXCEPTION TYPE : "+cnfe);
									System.out.println("");
									System.out.println("");
								
									System.out.print("\t\t ENTER ANY KEY TO GO MAIN MENU : ");
									String opt = sc.nextLine();
									System.out.println("");
									continue;
								}
								
								
							}
							
							else if(choice == 999)
							{
								break;
							}
						
							else
							{
								
								try 
								{
									throw new InvalidInputTakenException();
								}
								
								catch (InvalidInputTakenException iite)
								{
									System.out.println("");
									System.out.println("|*****************************************************************************************************************************************************|");
									System.out.println("");
									System.out.println("");
									System.out.println("\t\t EXCEPTION TYPE : "+iite);
									System.out.println("");
									System.out.println("");
								
									System.out.print("\t\t ENTER ANY KEY TO GO MAIN MENU : ");
									String opt = sc.nextLine();
									System.out.println("");
									continue;
								}		
							}
						}
					
						while(choice!=999);
						System.out.println("");
						System.out.println("|*****************************************************************************************************************************************************|");
						System.out.println("");
						System.out.println("\t\t\t\t\t\t\t CONGRATULATIONS ❤❤❤ ");
						System.out.println("\t\t\t\t\t\t\t LOG-OUT SUCCESSFULLY !!!");
						System.out.println("");
						System.out.println("|*****************************************************************************************************************************************************|");
						System.out.println("");
						System.out.println("");
					
						System.out.print("\t\t ENTER ANY KEY TO GO LOGIN/SIGNUP MENU : ");
						String opt = sc.nextLine();
						System.out.println("");
								
					}
						    
					else 
					{
						System.out.println("");
						System.out.println("|*****************************************************************************************************************************************************|");
						System.out.println("");
						System.out.println("\t\t USERNAME OR PASSWORD IS INCORRECT !!!");
						System.out.println("");
						    	
					}  
						  
						  
					if(q==null)
					{
						throw new UserNotFoundException();
					}
						    
				}
				
				catch(UserNotFoundException unfe)
				{
					System.out.println("");
					System.out.println("|*****************************************************************************************************************************************************|");
					System.out.println("");
					System.out.println("");
					System.out.println("\t\t EXCEPTION TYPE : "+unfe);
					System.out.println("");
					System.out.print("\t\t ENTER ANY KEY TO GO MAIN MENU : ");
					String opt = sc.nextLine();
					System.out.println("");
				}
				 	
				finally
				{
					em.close();
					emf.close();
				} 
				 
			}
			
			else if(choice==3)
			{
				System.out.println("");
				System.out.println("");
				System.out.println("|****************************************************|   FORGOT - USERNAME OR PASSWORD   |*************************************************************|");
				System.out.println("");
				System.out.println("");
				System.out.println("\n\t\t\t\t\t\t 1- SET USERNAME \t\t 2- SET PASSWORD");
				System.out.println("");
				System.out.println("");
				System.out.print("\t\t User Choice : ");
				int opt = sc.nextInt();
				sc.nextLine();
			
				if(opt == 1)
				{
					String phoneno ;
					System.out.println("");
					System.out.print("\t\t Contact : +91-");
					phoneno = sc.nextLine();
					Signup_Process contact = new Signup_Process(phoneno);
					
					try
					{
						String con = contact.getPhoneno();
						String uname = contact.getUsername();
						
						emf=Persistence.createEntityManagerFactory("project");
						em=emf.createEntityManager();
						et=em.getTransaction();
						et.begin();
							
						Query query=(Query) em.createQuery("from Signup_Process where phoneno=:con");
						query.setParameter("con", phoneno);
						Signup_Process q=(Signup_Process)query.uniqueResult();
						                   
						if(q!=null) 
						{
							System.out.println("");
							System.out.println("|*****************************************************************************************************************************************************|");
							System.out.println("");
							System.out.println("\t\t\t\t\t\t\t|***********|  SET NEW USERNAME  |***********| ");
							System.out.println("");
							System.out.print("\t\t New Username : ");
							String newusername = sc.nextLine();
								
							Query newuser = (Query) em.createQuery("update Signup_Process set username=:uname where phoneno=:con");
							newuser.setParameter("uname", newusername);
							newuser.setParameter("con", phoneno);
							int status = newuser.executeUpdate();
							System.out.println(status);
							
							System.out.println("");
							System.out.println("|*****************************************************************************************************************************************************|");
							System.out.println("");
							System.out.println("\t\t\t\t\t\t Congratulations Username Is Updated");
							System.out.println("");
							System.out.println("|*****************************************************************************************************************************************************|");
							System.out.println("");
							System.out.println("");
							
							System.out.print("\t\t ENTER ANY KEY TO GO MAIN MENU : ");
							String opt1 = sc.nextLine();
							System.out.println("");
							et.commit();
									
						}
						
						else
						{
							throw new ContactNotFoundException();
						}
					}
				
					catch(ContactNotFoundException cnfe)
					{
						System.out.println("");
						System.out.println("|*****************************************************************************************************************************************************|");
						System.out.println("");
						System.out.println("");
						System.out.println("");
						System.out.println("\t\t EXCEPTION TYPE : "+cnfe);
						System.out.println("");
						System.out.println("");
						System.out.println("");
						
						System.out.print("\t\t ENTER ANY KEY TO GO MAIN MENU : ");
						String opt1 = sc.nextLine();
						System.out.println("");
					}
				}
			
				else if(opt == 2)
				{
					String phoneno ;
					System.out.println("");
					System.out.print("\t\t Contact : +91-");
					phoneno = sc.nextLine();
					Signup_Process contact = new Signup_Process(phoneno);
					
					try
					{
						String con = contact.getPhoneno();
						String upass = contact.getPassword();
						
						emf=Persistence.createEntityManagerFactory("project");
						em=emf.createEntityManager();
						et=em.getTransaction();
						et.begin();
							
						Query query=(Query) em.createQuery("from Signup_Process where phoneno=:con");
						query.setParameter("con", phoneno);
						Signup_Process q=(Signup_Process)query.uniqueResult();
						                   
						if(q!=null) 
						{
							System.out.println("");
							System.out.println("|*****************************************************************************************************************************************************|");
							System.out.println("");
							System.out.println("\t\t\t\t\t\t\t|***********|  SET NEW PASSWORD  |***********| ");
							System.out.println("");
							System.out.print("\t\t New Password : ");
							String newuserpass = sc.nextLine();
							Query newuser = (Query) em.createQuery("update Signup_Process set password=:upass where phoneno=:con");
							newuser.setParameter("upass", newuserpass);
							newuser.setParameter("con", phoneno);
							int status = newuser.executeUpdate();
							System.out.println(status);
							
							System.out.println("");
							System.out.println("|*****************************************************************************************************************************************************|");
							System.out.println("");
							System.out.println("\t\t\t\t\t\t Congratulations New Password Is Updated");
							System.out.println("");
							System.out.println("|*****************************************************************************************************************************************************|");
							System.out.println("");
							System.out.println("");
							
							System.out.print("\t\t ENTER ANY KEY TO GO MAIN MENU : ");
							String opt1 = sc.nextLine();
							System.out.println("");
							et.commit();
									
						}
					
						else
						{
							throw new ContactNotFoundException();
						}
					}
				
					catch(ContactNotFoundException cnfe)
					{
						System.out.println("");
						System.out.println("|*****************************************************************************************************************************************************|");
						System.out.println("");
						System.out.println("");
						System.out.println("");
						System.out.println("\t\t EXCEPTION TYPE : "+cnfe);
						System.out.println("");
						System.out.println("");
						System.out.println("");
						
						System.out.print("\t\t ENTER ANY KEY TO GO MAIN MENU : ");
						String opt1 = sc.nextLine();
						System.out.println("");
					}
				}
			
				else
				{
					System.out.println("");
					System.out.println("|*****************************************************************************************************************************************************|");
					System.out.println("");
					System.out.println("");
					System.out.println("\t\t\t\t\t\t\t|*******|  INVALID CHOICE  |******| ");
					System.out.println("\t\t\t\t\t\t\t|*******| PLEASE TRY AGAIN |******|");
					System.out.println("");
					System.out.println("");
					System.out.print("\t\t ENTER ANY KEY TO GO MAIN MENU : ");
					String opt1 = sc.nextLine();
					System.out.println("");
				}
					
					
			}
				
			else if(choice==4)
			{
				break;
			}
				
			else
			{
				try 
				{
					System.out.println("");
					System.out.println("|*****************************************************************************************************************************************************|");
					System.out.println("");
					System.out.println("");
						
					throw new InvalidInputTakenException();
						
				}
				
				catch (InvalidInputTakenException iite)
				{
					
					System.out.println("");
					System.out.println("");
					System.out.println("\t\t EXCEPTION TYPE : "+iite);
					System.out.println("");
				}
			
				finally
				{									
					System.out.println("");
					System.out.print("\t\t ENTER ANY KEY TO GO LOGIN/SIGNUP MENU : ");
					String opt = sc.nextLine();
					System.out.println("");
				}
			}
						
		}
			
		while (choice != 4);
			
		System.out.println("");
		System.out.println("|*****************************************************************************************************************************************************|");
		System.out.println("");
		System.out.println("\t\t\t\t\t\t THANK-YOU FOR USING OUR CARRIER-GUIDE APP ❤❤❤ ");
		System.out.println("\t\t\t\t\t\t SEE YOU SOON !!!");
		System.out.println("");
		System.out.println("|*****************************************************************************************************************************************************|");
		System.out.println("");

		
	}
}
