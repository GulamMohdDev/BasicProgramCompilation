// Loops for multi iteration
#include <iostream>

using namespace std;

int main() {
    // while loop
    int i=0;
    while (i<10)
    {
        cout<< "i : " << i << endl;
        i++;
    }
    cout<< endl << endl << endl;
    // for loop
    for(int j=0;j<10;j++) {
        cout<< "J : " << j << endl;
    }
    cout<< endl << endl << endl;
    // do-while loop //run once even condition is false
    int k=-5;
    do {
        cout<< "k : "<< k << endl;
    } while (k>=0);

    return 0;

}

void clearScreen() {
#ifdef _WIN32 // Check if compiling on Windows
    system("cls");
#else // Assume Linux/macOS or other Unix-like system
    system("clear");
#endif
}