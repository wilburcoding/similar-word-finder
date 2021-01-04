
import java.util.*;
import java.io.*;
class Main {

    public static void print(String text, int times) {
        for (int i = 0; i < times; i++) {
            System.out.print(text);
        }

    }
    public static void println(String text, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(text);
        }

    }
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList();
        try {
            BufferedReader reader = new BufferedReader(new FileReader("word.txt"));
            

            String line = null;
            while ((line = reader.readLine()) != null) {
                arrayList.add(line);
            }
            println("Welcome to similar word finder. This program searches ​58100 different words for words that are similar to the word that you entered",1);
            print("Enter a word: ", 1);

            Scanner scanner = new Scanner(System.in);
            String checkWord = scanner.nextLine();
						for (int i = 0; i < checkWord.length(); i++) {
								// checks whether the character is not a letter
								// if it is not a letter ,it will return false
								if ((Character.isLetter(checkWord.charAt(i)) == false)) {
									println("Your word contains a not-unicode letter!",1);
									System.exit(1);
								}
						}
						ArrayList<String> similarwords = new ArrayList<>();
						print("How strict do you want the search to be? (1) Very Strict (2) Normal strict (3) Not very strict: ",1);
						String strict = scanner.nextLine();
            //println(arrayList.toString(),1);
            int minus = 0;
						if (strict == "1") {
							minus = 1;
						} else {
							if (strict=="2") {
								minus = 2;
							} else {
								if (strict=="3") {
									minus = 3;
								
								} else {
									minus =2;
								}
							}
						}
            int timesRight = 0;
            int timesRight2 = 0;
            if (checkWord.length() > 3) {
                  timesRight2 = checkWord.length()-minus;
										println("Similar Words:", 1);
            } else {
							if (checkWord.length() > 2) {
								timesRight2=checkWord.length();
							}else {
								timesRight=2;
							}
                  
          	}
            checkWord = checkWord.trim();                
          	try {
                  String[] letters = checkWord.split("");
                                
                  for (String word3 : arrayList) {
                                    
                        timesRight=0;
                        String[] letters2 = word3.split("");
                        int under = 0;
                        if (letters.length<=letters2.length) {
                                under = letters.length;
                        } else {
                                under = letters2.length;
                        }
                        for(int i = 0; i < under;i++) {
                                    
                					if (letters2[i].equals(letters[i])) {
                                timesRight++;
                                                
                          } else {
                              if(i<letters2.length-2 && i<letters.length-2){
                                  if (letters2[i+1].equals(letters[i])) {
                                        timesRight++;
                                                        
                                                    
                                  }
                              }
                                                
                        	}
                        } 

                        if (timesRight>timesRight2) {
													if 
													if (word3 != checkWord) {
															//System.out.println(checkWord);
													    similarwords.add(word3);
                              println(word3 +" #" + similarwords.size() , 1);
													}else {
														println(word3 + " (search word)",1);
													}
                                            
                        } else {
													//println("x",1);
												}
                  }
                                    
                                    
            } catch (Exception e) {
                    System.err.println("Error!: " + e);
                                
            }
                           
                        
                                                      
                            

                    
                
                

            
            
        } catch (Exception e) {
            e.printStackTrace();
      }
		}
}


    
