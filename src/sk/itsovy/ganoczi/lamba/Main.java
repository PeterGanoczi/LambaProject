package sk.itsovy.ganoczi.lamba;

public class Main {
    public static void main(String[] args) {


        Student student=new Student();
        Student.randomStudent makeGreeting = (name) -> "Hello" +name;
        Student.randomStudent nameInCapital= (name) -> name.toUpperCase();
        Student.randomStudent nameInLower= (name) -> name.toLowerCase();

        System.out.println(student.makeStudent("Peter ", makeGreeting));
        System.out.println(student.makeStudent("Marek ", nameInCapital));
        System.out.println(student.makeStudent("Peter ",  nameInLower));
//
//        Calculator myApp = new Calculator();
//        Calculator.IntegerMath add = (a, b) -> a + b;
//        Calculator.IntegerMath sub = (a, b) -> a - b;
//        System.out.println(" 40 + 2 = " + myApp.operateBinary(40, 2, add));
//        System.out.println(" 40 - 2 = " + myApp.operateBinary(40, 2, sub));
//
//        int[] num= {1, 7, 2,3,4,0,6,8,9};
//        fillNumber(num);
//
//        for (int i=0; i<9; i++){
//            System.out.println(num[i]);
//        }

    }

    public static void fillNumber(int arr[]){
        int number=45;

        for (int j=0; j<9; j++){
            number=number-arr[j];
        }
        for (int i=0; i<9; i++){
            if (arr[i]==0){
                arr[i]=number;
            }
        }
    }
}
