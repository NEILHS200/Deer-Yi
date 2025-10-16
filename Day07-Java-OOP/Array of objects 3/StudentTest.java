package com.yde.test6;

/**
 * I wanna create an array that contains students' information: Student Number, name, age
 * And there are some function I also wanna make it happened.
 * 1. before I add a new student to array, I need to check if their student number is the only one
 * 2. I can delete one specific student by searching their student number
 * 3. make one student's age +1
 */
public class StudentTest {
    public static void main(String[] args) {
        //1. create an array about students
        Student[] arr = new Student[3];

        //2. create a new student object and make sure their student number is the only one in system
        Student s1 = new Student(1, "Deer", 20);
        Student s2 = new Student(2, "Jordan", 25);
        Student s3 = new Student(3, "Carlos", 25);

        //3. add object to array
        arr[0] = s1;
        arr[1] = s2;
        arr[2] = s3;
        //4. add another student and to check if their student number is the only one
        Student s4 = new Student(4, "Shin", 20);

        //to check if the student number is the only one
        boolean flag = contains(arr,s4.getStudentNum());
        Student[] newArr = createNewArr(arr);
        if(flag){
            //(1) Exist! --- no need to add
            System.out.println("Current student number already existed");
        }else{
            //(2) Doesn't exist! --- add it to the array
            //(3) The original array is full, array's length + 1
            int elements = getCount(arr);
            if(elements == arr.length){
              newArr[elements] = s4;
              printArr(newArr);
            }else{
                //(4) The original array is not full
                arr[elements] = s4;
                printArr(arr);
            }
        }

        //delete one student based on the student id
        System.out.println("========================================");
        int index = getIndex(newArr, 3);
        for (int i = 0; i < newArr.length; i++) {
            if(index >= 0){
                newArr[index] = null;
            }else{
                System.out.println("Student not Found!");
            }
        }
        printArr(newArr);

        //search all the students and make one's age +1 based on the id you enter
        changeAge(newArr, 4);

    }

    public static void changeAge(Student[] arr, int id){
        int index = getIndex(arr, id);
        if(index >= 0){
            int newAge = arr[index].getAge() + 1;
            arr[index].setAge(newAge);
        }
        printArr(arr);
    }

    public static int getIndex(Student[] arr, int id){
        //I have arr and id, and now I want to check if the id in the arr
        //And elements in arr should not be null
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != null){
                int sid = arr[i].getStudentNum();
                if(sid == id){
                   return sid - 1;
                }
            }
        }
        return -1;
    }

    public static void printArr(Student[] arr){
        for (int i = 0; i < arr.length; i++) {
            Student student = arr[i];
            if(student != null){
                System.out.println(student.getStudentNum() + ", " +
                        student.getName() + ", " + student.getAge());
            }
        }
    }

    public static Student[] createNewArr(Student[] arr){
        Student[] newArr = new Student[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }

        return newArr;
    }

    // define a method to count how many elements are in thr array currently
    public static int getCount(Student[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != null){
                count++;
            }
        }
        return count;
    }

    // define a method to help us check if student number is the only one
    public static boolean contains(Student[] arr, int studentNum){
        for (int i = 0; i < arr.length; i++) {
            Student student = arr[i];
            int studentNumber = 0;
            if(student != null){
                studentNumber = student.getStudentNum();
            }
            if (studentNumber == studentNum){
                return true;
            }
        }
        return false;
    }
}
