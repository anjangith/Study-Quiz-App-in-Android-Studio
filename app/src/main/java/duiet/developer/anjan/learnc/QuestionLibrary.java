package duiet.developer.anjan.learnc;

/**
 * Created by HP on 02-09-2017.
 */

public class QuestionLibrary {

    private String mQuestions[]={
            "The size of an object or a type can be determined using which operator?",
            " All members of class have which access to its members",
            "Which of the following functions below can be used Allocate space for array in memory?",
            " Which is not a correct variable type",
            " Which value we cannot assign to reference?",
            "What does your class can hold?",
            " If the user didn’t supply the value, what value will it take?",
            " Where does the object is created?",
            "Which of these following members are not accessed by using direct member access operator?",
            "Pick out the other definition of objects",
            " Which of the following correctly declares an array?",
            "What is the index number of the last element of an array with 9 elements?",
            "Which of the following gives the memory address of the first element in array?",
            "Which value will it take when both user and default values are given?",
            "The if..else statement can be replaced by which operator?",
            "Which type is best suited to represent the logical values?",
            "The value 132.54 can represented using which data type?",
            "How to access the object in the class?",
            "How many ways of passing a parameter are there in c++?",
            " Evaluate the following\n" +
                    "(false && true) || false || true",
            " Which header file is used to manipulate the string?",
            "What is the difference between unsigned int length() and unsigned int size()?",
            "Where does the execution of the program starts?",
            "Which is more effective while calling the functions?",
            "What is the scope of the variable declared in the user defined function?",
            "Which of the following permits function overloading on c++?",
            "Function overloading is also similar to which of the following?",
            "In which of the following we cannot overload the function?",
            "Which rule will not affect the friend function?",
            "Which is used to define the member of a class externally?",
            "Constructors are used to",
            "Which keyword is used to handle the expection?",
            "Which is used to throw a exception?",
            "How to declare a wide character in the string literal?",
            "How many types of returning values are present in c++?",
            "When will we use the function overloading?",
            "Which operator is having the highest precedence?",
            "What type of comments does c++ support?",
            "How many objects can present in a single class?",
            "How many types of representation are in the string?"


    };
    private String[][] mChoices= {{"malloc", "sizeof", "calloc", "free"},
            {"Public", "Private", "Protected", "None of above"},
            {"malloc", "calloc", "realloc", "free"},
            {"int", "float", "bool", "real"},
            {"integer", "floating", "unsigned", "null"},
            {"data", "functions", "both data and functions", "none"},
            {"default value", "rise an error", "both", "none"},
            {"class", "constructor", "destructor", "attributes"},
            {"public", "private", "protected", "private and protected"},
            {"member of the class", "associate of the class", "attribute of the class", "instance of the class"},
            {"int array[10];", "int array;", "array{10};", "array array[10];"},
            {"9","8","0","programmer defined"},
            {"array[0];","array[1];"," array(2);","array;"},
            {"user value","default value","custom value","none of the mentioned"},
            {"Bitwise operator","Conditional operator","Multiplicative operator","none of the mentioned"},
            {"integer","boolean","character","all of the mentioned"},
            {"double","void","int","bool"},
            {"scope resolution operator","ternary operator","direct member access operator","none of the mentioned"},
            {"1","2","3","4"},
            {"0","1","false","none"},
            {"iostream","iomanip","string","container"},
            {"Returns a different value","They are same","They are same","None of the mentioned"},
            {"user-defined function","main function","void function","none of the above"},
            {"call by value","call by reference","call by pointer","none of the above"},
            {"whole program","only inside the {} block","the main function","none of the mentioned"},
            {"type","number of arguments","type & number of arguments","none of the mentioned"},
            {"operator overloading","constructor overloading","destructor overloading","destructor overloading"},
            {"return function","caller","called function","none of the mentioned"},
            {"private and protected members of a class cannot be accessed from outside","private and protected member can be accessed anywhere","protected member can be accessed anywhere","none"},
            {":","::","#","none"},
            {"initialize the objects","construct the data members","both initialize the objects & construct the data members","none of the mentioned"},
            {"try","throw","catch","none"},
            {"throw","try","catch","none"},
            {"L prefix","l prefix","W prefix","none of above"},
            {"1","2","3","4"},
            {"same function name but different number of arguments","different function name but same number of arguments","same function name but same number of arguments","different function name but different number of arguments"},
            {"postfix","unary","shift","equality"},
            {"single line","multi line","single line and multi-line","none"},
            {"1","2","3","as many as you want"},
            {"1","2","3","4"}
    };

    private String mAnswers[]={"sizeof","Public","calloc","real","null","both data and functions","default value","class","private and protected","instance of the class","int array[10];","8",
    "array[0];","user value","Conditional operator","boolean","double","direct member access operator","3","1","string","They are same","main function",
    "call by reference","only inside the {} block","type & number of arguments","constructor overloading","return function","private and protected members of a class cannot be accessed from outside",
     "::","initialize the objects","catch","throw","L prefix","3","same function name but different number of arguments","postfix","single line and multi-line",
    "as many as you want","2"
    };

    public String getQuestion(int a){

        String question=mQuestions[a];
        return question;
    }

    public String getChoiceA(int a){

        String getchoiceA=mChoices[a][0];
        return getchoiceA;

    }

    public String getChoiceB(int a){

        String getchoiceB=mChoices[a][1];
        return getchoiceB;

    }
    public String getChoiceC(int a){

        String getchoiceC=mChoices[a][2];
        return getchoiceC;

    }
    public String getChoiceD(int a){
        String getChoiceD=mChoices[a][3];
        return getChoiceD;
    }
    public String getAnswer(int a){
        String getAnswer=mAnswers[a];
        return getAnswer;
    }
}
