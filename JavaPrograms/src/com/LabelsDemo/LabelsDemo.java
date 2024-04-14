
package com.LabelsDemo;
//LABELS ACT AS GOTO STATEMENTS IN OTHER LANGUAGES
//FLOW OF EXECUTION IS RENDERED TO ANOTHER LINE

/*The considerable difference between break and continue is that the 
break exits a loop at once. Once a break statement is executed, 
the loop will not run again. However, after executing the continue statement,
the following lines of code will be skipped for the current iteration only. */
//LABELS ARE USED TO BREAK MAIN LOOP IN MULTIPLE NESTED LOOPS
//SINCE BREAK ONLY BREAKS NEAREST LOOP

//LABELS ARE WORDS  FOLLOWED BY :

public class LabelsDemo {

	public static void main(String[] args) {
		System.out.println("======== labels beginning ");
		loop1: for(int i = 0; i < 5; i++) {
				System.out.println("counter i: " + i);
		loop2: for(int j = 0; j < 5; j++) {
					System.out.println("counter j: " + j);
						if(j >= 0 && j < 3) {
							System.out.println("continue loop2");
							continue loop2;
						}else {
							System.out.println("break loop1");
							break loop1;
							
						}
		}
		}

	}

}
