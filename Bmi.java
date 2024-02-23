class Bmi {

		 private String name;
		 private int age;
		 private double height, weight;
		 static final double KILOGRAMS_PER_POUND = 0.45359237;
		 static final double METERS_PER_INCH = 0.0254;
		 
		 public Bmi(){
		        name = "John Black";
		        age = 25;
		        weight = 100;
		        height = 50;
		    }
		 public Bmi(String name1, double weight1, double height1){
		        name = name1;
		        age = 20;
		        weight = weight1;
		        height = height1;
		    }
		    
		    public Bmi(String name1, int age1, double weight1, double height1){
		        name = name1;
		        age = age1;
		        weight = weight1;
		        height = height1;
		    }
		 public void setName(String name1) {
			 name=name1;
		 }
		 public String getName() {
			 return name;
		 }
		 public void setAge(int age1) {
			 age=age1;
		 }
		 public int getAge() {
			 return age;
		 }
		 public void setWeight(double weight1) {
			 weight=weight1;
		 }
		 public double getWeight() {
			 return weight;
		 }
		 public void setHeight(double height1) {
			 height=height1;
		 }
		 public double getHeight() {
			 return height;
		 }
		 
		 public double getBMI(){
		        double kilogram = weight * KILOGRAMS_PER_POUND;
		        double meters = height * METERS_PER_INCH;
		        
		        double BMI = kilogram/(meters*meters);
		        
		        return BMI;
		    }
		 public String getStatus(){
		       
		        if(getBMI() <= 18.5) {
		            return "Underweight";
		        }
		        else if(getBMI() > 18.5 && getBMI() <= 25.0) {
		            return"Normal";
		        }
		        else if(getBMI() >= 25.0 && getBMI() <= 30.0) {
		            return "Overweight";
		        }
		        else {
		            return "Obese";
		        }
		    }
		 
	}

