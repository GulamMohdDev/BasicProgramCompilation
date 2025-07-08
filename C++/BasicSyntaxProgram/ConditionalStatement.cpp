//  Conditional Statements
#include <iostream>

using namespace std;

int main() {

    //ternary operator  statements
    int num = 3;
    bool returnValue = num <= 3 ? true: false;
    cout << "num is less than or equal 3 : "<< returnValue <<endl;
    // if else if else statement
    bool a = false;
    bool b = true;

    if(a) {
        cout << "Condition is not going to run"<<endl;
    } else if (b) {
        cout << "Condition is going to run"<<endl;
    } else {
        cout << "default is going to run"<<endl;
    }
    
    // switch statement
    char ch = 'a';
    switch (ch)
    {
    case 'a':
        cout << "Character is a"<<endl;
        break;

    case 'b':
        cout << "Character is a"<<endl;
        break;    
    
    default:
        cout << "not matched with any cases"<<endl;
        break;
    }

}