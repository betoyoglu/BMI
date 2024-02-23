import java.util.Scanner;

	public class BmiTest {
		
	   public static void seperationOfData1() {
			
			Scanner scanner = new Scanner(System.in);
			
			String input = scanner.nextLine();
			String [] word = input.split(" ");
			
		}
		public static void seperationOfData2(String data) {
			
			String k;
			int a,b,c,d;
			String l;
			
			a=data.indexOf(" ");
			b=data.indexOf(" ", a+1);
			c=data.indexOf(" ", b+1);
			d=data.indexOf(" ", c+1);
			
			k=data.substring(0,a);
			l=data.substring(a,b);
			String name=k+l;
			
			String age1 = data.substring(b+1,c);
			String weight1 = data.substring(c+1,d);
			String height1 = data.substring(d);
			
			int age= Integer.valueOf(age1);
			
			double weight = Double.valueOf(weight1);
			
			double height = Double.valueOf(height1);
			
			Bmi Bmi= new Bmi(name,age,weight,height);	
		}
			
			public static void main(String[] args) {
				
			    Scanner scanner = new Scanner(System.in);
			    
			    Bmi bmi[] = new Bmi[3];
			    
			    for(int i=0;i<3;i++)
			    {
			        System.out.print("---ENTER PERSON " + (i+1) + "'S VALUES---");
			        
			        System.out.println("\nEnter name, age, weight, height (as space seperated):");	
			        
			        String name1 = scanner.next();
			        String lastName = scanner.next();
			        int age1 = scanner.nextInt();
			        double weight1 = scanner.nextDouble();
			        double height1 = scanner.nextDouble();
			        	
			        bmi[i] = new Bmi(name1,age1,weight1,height1);
			    } 
				for(int i=0;i<3;i++){
			        System.out.print("** The BMI result for  " + bmi[i].getName());
			        System.out.print(" (Age: " + bmi[i].getAge());
			        System.out.print(" Weight: " + bmi[i].getWeight());
			        System.out.print(" Height: " + bmi[i].getHeight());
			        System.out.print(") is  " + bmi[i].getStatus() + "\n");
			    }
			}

	}
