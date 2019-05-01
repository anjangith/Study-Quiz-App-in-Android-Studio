package duiet.developer.anjan.learnc;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class BundleActivity extends AppCompatActivity {
    private ListView listView;
    private ListAdapter adapter;
    private ArrayList<modelClass> models;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bundle);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);
        listView=(ListView)findViewById(R.id.contentList);
        int pos=getIntent().getIntExtra("position",0);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setTitle("C++ For Beginners");
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        switch(pos){
            case 0:
                InitBasics();
                break;

            case 1:
                InitOperators();
                break;

            case 2:
                InitIO();
                break;

            case 3:
                initPointers();
                break;

            case 4:
                initFunctions();
                break;

            case 5:
                initFriendFunction();
                break;

            case 6:
                initFunctionOverload();
                break;

            case 7:
                initArray();
                break;

            case 8:
                initDynamicMemory();
                break;

            case 9:
                initOOP();
                break;

            case 10:
                initTemplates();
                break;

        }


    }

    private void initFriendFunction() {

        models=new ArrayList<>();
        modelClass modelClass=new modelClass();
        modelClass.setName("Friend Function in C++");
        modelClass.setDescription("If a function is defined as a friend function then, the private and protected data of a class can be accessed using the function.\n" +
                "\n" +
                "The complier knows a given function is a friend function by the use of the keyword friend.\n" +
                "\n" +
                "For accessing the data, the declaration of a friend function should be made inside the body of the class (can be anywhere inside class either in private or public section) starting with keyword friend.");
        models.add(modelClass);

        modelClass=new modelClass();
        modelClass.setName("Declaration of friend function in C++");
        modelClass.setDescription("class className\n" +
                "{\n" +
                "    ... .. ...\n" +
                "    friend return_type functionName(argument/s);\n" +
                "    ... .. ...\n" +
                "}\n" +
                "\n" +
                "return_type functionName(argument/s)\n" +
                "{\n" +
                "    ... .. ...\n" +
                "    // Private and protected data of className can be accessed from\n" +
                "    // this function because it is a friend function of className.\n" +
                "    ... .. ...\n" +
                "}");
        models.add(modelClass);

        modelClass=new modelClass();
        modelClass.setName("Fiend Class in C++");
        modelClass.setDescription("Similarly, like a friend function, a class can also be made a friend of another class using keyword friend");
        models.add(modelClass);

        modelClass=new modelClass();
        modelClass.setName("For example");
        modelClass.setDescription("... .. ...\n" +
                "class B;\n" +
                "class A\n" +
                "{\n" +
                "   // class B is a friend class of class A\n" +
                "   friend class B;\n" +
                "   ... .. ...\n" +
                "}\n" +
                "\n" +
                "class B\n" +
                "{\n" +
                "   ... .. ...\n" +
                "}");
        models.add(modelClass);

        adapter=new ListAdapter(this,models);
        listView.setAdapter(adapter);




    }

    private void initTemplates() {

    models=new ArrayList<>();
    modelClass modelClass=new modelClass();
    modelClass.setName("Template");
    modelClass.setDescription("Templates are used when we have to make a same function function for different data types and functions." + "Suppose we have created a overload function SUM " +
            "which accepts different types of datatypes and perform calculation. Instead of creating seperate function for each we can create " +
            "a template\n There are two types of templates:\n1-Function Templates\n2-Class Templates"

    );
    models.add(modelClass);

    modelClass=new modelClass();
    modelClass.setName("Function Templates");
    modelClass.setDescription("Function Templates prevent us from defining separate functions performing the same task for different data types.\n" +
            "We need to tell the compiler that this is a function template because it will not identify T ( since T is not a keyword ). For this, we need to include\n" +
            "template <typename T>    \n" +
            "This will tell the compiler that T is a type of template parameter");
    models.add(modelClass);

    modelClass=new modelClass();
    modelClass.setName("For example a template function looks like");
    modelClass.setDescription("T sum( T x, T y)\n" +
            "{\n" +
            "    return x + y;\n" +
            "}");
    models.add(modelClass);

    modelClass=new modelClass();
    modelClass.setName("Function Templates");
    modelClass.setDescription("We also have the possibility to write class templates, so that a class can have members that use template parameters as types");
    models.add(modelClass);

    modelClass=new modelClass();
    modelClass.setName("For example");
    modelClass.setDescription("template <class T>\n" +
            "class mypair {\n" +
            "    T values [2];\n" +
            "  public:\n" +
            "    mypair (T first, T second)\n" +
            "    {\n" +
            "      values[0]=first; values[1]=second;\n" +
            "    }\n" +
            "};");
    models.add(modelClass);
    adapter=new ListAdapter(this,models);
    listView.setAdapter(adapter);

    }


    private void initOOP() {

        models=new ArrayList<>();
        modelClass modelClass=new modelClass();
        modelClass.setName("Basics of Object Oriented Programming");
        modelClass.setDescription(getResources().getString(R.string.oop));
        models.add(modelClass);

        modelClass=new modelClass();
        modelClass.setName("Class");
        modelClass.setDescription(getResources().getString(R.string.classs));
        models.add(modelClass);

        modelClass=new modelClass();
        modelClass.setDescription(getResources().getString(R.string.clone));
        models.add(modelClass);

        modelClass=new modelClass();
        modelClass.setName("Object");
        modelClass.setDescription(getResources().getString(R.string.objects));
        models.add(modelClass);

        modelClass=new modelClass();
        modelClass.setDescription(getResources().getString(R.string.obj));
        models.add(modelClass);


        modelClass=new modelClass();
        modelClass.setName("Example");
        modelClass.setDescription("// classes example\n" +
                "#include <iostream>\n" +
                "using namespace std;\n" +
                "\n" +
                "class Rectangle {\n" +
                "    int width, height;\n" +
                "  public:\n" +
                "    void set_values (int,int);\n" +
                "    int area() {return width*height;}\n" +
                "};\n" +
                "\n" +
                "void Rectangle::set_values (int x, int y) {\n" +
                "  width = x;\n" +
                "  height = y;\n" +
                "}\n" +
                "\n" +
                "int main () {\n" +
                "  Rectangle rect;\n" +
                "  rect.set_values (3,4);\n" +
                "  cout << \"area: \" << rect.area();\n" +
                "  return 0;\n" +
                "}");
        models.add(modelClass);

        modelClass=new modelClass();
        modelClass.setName("Output- area:12");
        modelClass.setDescription("Here the name of the class is Rectangle and we created an object named rect in our main method");
        models.add(modelClass);

        modelClass=new modelClass();
        modelClass.setName("Encapsulation and Data Abstraction");
        modelClass.setDescription(getResources().getString(R.string.encapsulation));
        models.add(modelClass);

        modelClass=new modelClass();
        modelClass.setName("Inheritance");
        modelClass.setDescription(getResources().getString(R.string.inheritance));
        models.add(modelClass);

        modelClass=new modelClass();
        modelClass.setName("Dynamic Binding");
        modelClass.setDescription(getResources().getString(R.string.data));
        models.add(modelClass);

        modelClass=new modelClass();
        modelClass.setName("Message Passing");
        modelClass.setDescription(getResources().getString(R.string.message));
        models.add(modelClass);
        adapter=new ListAdapter(this,models);
        listView.setAdapter(adapter);





    }

    private void initDynamicMemory() {

        models=new ArrayList<>();
        modelClass modelClass=new modelClass();
        modelClass.setName("What is dynamic memory?");
        modelClass.setDescription(getResources().getString(R.string.dynamic));
        models.add(modelClass);

        modelClass=new modelClass();
        modelClass.setName("NEW");
        modelClass.setDescription(getResources().getString(R.string.neww));
        models.add(modelClass);

        modelClass=new modelClass();
        modelClass.setName("DELETE");
        modelClass.setDescription(getResources().getString(R.string.delete));
        models.add(modelClass);

        adapter=new ListAdapter(this,models);
        listView.setAdapter(adapter);

    }

    private void initArray() {

        models=new ArrayList<>();
        modelClass modelClass=new modelClass();
        modelClass.setName("Arrays");
        modelClass.setDescription(getResources().getString(R.string.arrays));
        modelClass.setResource(R.drawable.array);
        models.add(modelClass);

        modelClass=new modelClass();
        modelClass.setName("One Dimenstional Array");
        modelClass.setDescription(getResources().getString(R.string.oned));
        modelClass.setResource(R.drawable.oned);
        models.add(modelClass);

        modelClass=new modelClass();
        modelClass.setName("Two dimensional Array");
        modelClass.setResource(R.drawable.twod);
        modelClass.setDescription(getResources().getString(R.string.twod));
        models.add(modelClass);

        modelClass=new modelClass();
        modelClass.setName("STRINGS");
        modelClass.setDescription(getResources().getString(R.string.strings));
        models.add(modelClass);

        modelClass=new modelClass();
        modelClass.setName("");
        modelClass.setDescription(getResources().getString(R.string.stringx));
        modelClass.setResource(R.drawable.cloud);
        models.add(modelClass);

        adapter=new ListAdapter(this,models);
        listView.setAdapter(adapter);







    }

    private void initFunctionOverload() {


        models=new ArrayList<>();
        modelClass modelClass=new modelClass();
        modelClass.setName("Function Overloading");
        modelClass.setDescription(getResources().getString(R.string.overload));
        models.add(modelClass);

        modelClass=new modelClass();
        modelClass.setName("Example");
        modelClass.setDescription("#include <iostream>\n" +
                "using namespace std;\n" +
                " \n" +
                "void print(int i) {\n" +
                "  cout << \" Here is int \" << i << endl;\n" +
                "}\n" +
                "void print(double  f) {\n" +
                "  cout << \" Here is float \" << f << endl;\n" +
                "}\n" +
                "void print(char* c) {\n" +
                "  cout << \" Here is char* \" << c << endl;\n" +
                "}\n" +
                " \n" +
                "int main() {\n" +
                "  print(10);\n" +
                "  print(10.10);\n" +
                "  print(\"ten\");\n" +
                "  return 0;\n" +
                "}");
        models.add(modelClass);

        modelClass=new modelClass();
        modelClass.setName("Output");
        modelClass.setDescription("Here is int 10 \n" +
                "Here is float 10.1 \n" +
                "Here is char* ten ");
        models.add(modelClass);

        adapter=new ListAdapter(this,models);
        listView.setAdapter(adapter);


    }


    private void initFunctions() {

        models=new ArrayList<>();
        modelClass modelClass=new modelClass();
        modelClass.setName("Introduction to function in C++");
        modelClass.setDescription(getResources().getString(R.string.function));
        modelClass.setResource(R.drawable.example);
        models.add(modelClass);

        modelClass=new modelClass();
        modelClass.setName("Passing Arguments to Function");
        models.add(modelClass);

        modelClass=new modelClass();
        modelClass.setName("Pass By Value");
        modelClass.setDescription("In pass by value method the original paramenters i.e. inside the main function do not get affected by changed made inside the function. They are saved in a different memory location and get wiped out as soon as the function ends\n\n" +
                "Example\n\n" +
                "// C++ program to illustrate\n" +
                "// call by value\n" +
                "#include <iostream>\n" +
                "using namespace std;\n" +
                " \n" +
                "void func(int a, int b)\n" +
                "{\n" +
                "    a += b;\n" +
                "    printf(\"In func, a = %d b = %d\\n\", a, b);\n" +
                "}\n" +
                "int main(void)\n" +
                "{\n" +
                "    int x = 5, y = 7;\n" +
                " \n" +
                "    // Passing parameters\n" +
                "    func(x, y);\n" +
                "    printf(\"In main, x = %d y = %d\\n\", x, y);\n" +
                "    return 0;\n" +
                "}");
        models.add(modelClass);

        modelClass=new modelClass();
        modelClass.setName("Output");
        modelClass.setDescription("In func, a = 12 b = 7\n" +
                "In main, x = 5 y = 7");

        modelClass=new modelClass();
        modelClass.setName("Pass By Reference");
        modelClass.setDescription("In pass by reference method the address of the variable is passed from the main method so the changes made to them inside the function is reflected back to the variables in the main function\n\n" +
                "Example\n\n" +
                "// C++ program to illustrate\n" +
                "// call by reference\n" +
                "#include <iostream>\n" +
                "using namespace std;\n" +
                " \n" +
                "void swapnum(int* i, int* j)\n" +
                "{\n" +
                "    int temp = *i;\n" +
                "    *i = *j;\n" +
                "    *j = temp;\n" +
                "}\n" +
                " \n" +
                "int main(void)\n" +
                "{\n" +
                "    int a = 10, b = 20;\n" +
                " \n" +
                "    // passing parameters\n" +
                "    swapnum(&a, &b);\n" +
                " \n" +
                "    printf(\"a is %d and b is %d\\n\", a, b);\n" +
                "    return 0;\n" +
                "} ");
        models.add(modelClass);

        modelClass=new modelClass();
        modelClass.setName("Output");
        modelClass.setDescription("a is 20 and b is 10");
        models.add(modelClass);


        adapter=new ListAdapter(this,models);
        listView.setAdapter(adapter);

    }

    private void initPointers() {

        models=new ArrayList<>();
        modelClass modelClass=new modelClass();
        modelClass.setName("Introduction To Pointers and References");
        modelClass.setDescription(getResources().getString(R.string.POINTER));
        models.add(modelClass);

        modelClass=new modelClass();
        modelClass.setName("Pointers");
        modelClass.setDescription(getResources().getString(R.string.point));
        models.add(modelClass);

        modelClass=new modelClass();
        modelClass.setName("References");
        modelClass.setDescription(getResources().getString(R.string.reference));
        models.add(modelClass);

        modelClass=new modelClass();
        modelClass.setName("For example");
        modelClass.setDescription("#include <iostream>\n" +
                "using namespace std;\n" +
                "int main() {\n" +
                "    int *pc, c;\n" +
                "    \n" +
                "    c = 5;\n" +
                "    cout << \"Address of c (&c): \" << &c << endl;\n" +
                "    cout << \"Value of c (c): \" << c << endl << endl;\n" +
                "\n" +
                "    pc = &c;    // Pointer pc holds the memory address of variable c\n" +
                "    cout << \"Address that pointer pc holds (pc): \"<< pc << endl;\n" +
                "    cout << \"Content of the address pointer pc holds (*pc): \" << *pc << endl << endl;\n" +
                "    \n" +
                "    c = 11;    // The content inside memory address &c is changed from 5 to 11.\n" +
                "    cout << \"Address pointer pc holds (pc): \" << pc << endl;\n" +
                "    cout << \"Content of the address pointer pc holds (*pc): \" << *pc << endl << endl;\n" +
                "\n" +
                "    *pc = 2; \n" +
                "    cout << \"Address of c (&c): \" << &c << endl;\n" +
                "    cout << \"Value of c (c): \" << c << endl << endl;\n" +
                "\n" +
                "    return 0;\n" +
                "}");
        models.add(modelClass);

        modelClass=new modelClass();
        modelClass.setName("Output");
        modelClass.setDescription("Address of c (&c): 0x7fff5fbff80c\n" +
                "Value of c (c): 5\n" +
                "\n" +
                "Address that pointer pc holds (pc): 0x7fff5fbff80c\n" +
                "Content of the address pointer pc holds (*pc): 5\n" +
                "\n" +
                "Address pointer pc holds (pc): 0x7fff5fbff80c\n" +
                "Content of the address pointer pc holds (*pc): 11\n" +
                "\n" +
                "Address of c (&c): 0x7fff5fbff80c\n" +
                "Value of c (c): 2");
        models.add(modelClass);

        adapter=new ListAdapter(this,models);
        listView.setAdapter(adapter);


    }

    private void InitIO() {

        models=new ArrayList<>();
        modelClass modelClass=new modelClass();
        modelClass.setName("Input and Output in C++");
        modelClass.setDescription(getResources().getString(R.string.inputandoutput));
        models.add(modelClass);

        modelClass=new modelClass();
        modelClass.setName("CIN");
        modelClass.setDescription(getResources().getString(R.string.cin));
        models.add(modelClass);

        modelClass=new modelClass();
        modelClass.setName("COUT");
        modelClass.setDescription(getResources().getString(R.string.cout));
        modelClass.setResource(R.drawable.exam);
        models.add(modelClass);

        adapter=new ListAdapter(this,models);
        listView.setAdapter(adapter);






    }

    private void InitOperators() {


    models=new ArrayList<>();
    modelClass modelClass=new modelClass();
    modelClass.setName("Operators");
    modelClass.setDescription(getResources().getString(R.string.operator));
    models.add(modelClass);

    modelClass=new modelClass();
    modelClass.setName("Lets see different types of Operators");
    modelClass.setDescription(getResources().getString(R.string.ope));
    modelClass.setResource(R.drawable.operator);
    models.add(modelClass);

    modelClass=new modelClass();
    modelClass.setName("Scope Resolution Operator");
    modelClass.setDescription(getResources().getString(R.string.scope));
    models.add(modelClass);


    adapter=new ListAdapter(this,models);
    listView.setAdapter(adapter);





    }

    private void InitBasics() {

        models=new ArrayList<>();
        modelClass modelClass=new modelClass();
        modelClass.setName("About C++");
        modelClass.setDescription(getResources().getString(R.string.basic1));
        models.add(modelClass);

        modelClass=new modelClass();
        modelClass.setName("Variables in C++");
        modelClass.setDescription(getResources().getString(R.string.variables));
        modelClass.setResource(R.drawable.variables);
        models.add(modelClass);


        modelClass=new modelClass();
        modelClass.setName("Datatypes in C++");
        modelClass.setDescription(getResources().getString(R.string.datatype));
        models.add(modelClass);

        modelClass=new modelClass();
        modelClass.setName("Types of Datatypes");
        modelClass.setDescription(getResources().getString(R.string.typesofd));
        modelClass.setResource(R.drawable.datatypes);
        models.add(modelClass);


        adapter=new ListAdapter(this,models);
        listView.setAdapter(adapter);


    }

}
