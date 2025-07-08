//make a text file and input text and read it
#include<iostream>
#include<fstream>
#include<iomanip>

using namespace std;

int main() {
    // create a file and Write data
    /*
    ofstream output_file("a.txt");
    if(!output_file) {
        cout << "The file could not be found." << endl;
        return -1; 
    }
    string name = "Zach";
    output_file << name; 
    */
   const int SIZE = 12;
    string arrNames[SIZE] ={""}; 
    string tempName; 
    ifstream inputFile("a.txt");
    if(!inputFile) {
        cout << "file not be found." << endl;
        return -1;
    }
    inputFile.ignore(255,'\n'); // ignore character
    //inputFile >> tempName; //get word without white space break
    getline(inputFile, tempName);
    int index = 0;
    while(!inputFile.eof()) {
        if(index==SIZE) {
            break;
        }
        arrNames[index] = tempName;
        index++;
        getline(inputFile, tempName);
        //inputFile >> tempName;
    }

    for(int i=0;i<SIZE;i++) {
        cout << arrNames[i] << endl;
    }

    //iominip uses

    cout << left <<setprecision(2) << fixed;
    double doubleValue = 201.792;
    int intVal = 7;
    cout << setw(25) << doubleValue << setw(25) << intVal << endl;

    return 0;
}