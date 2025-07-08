#include <iostream>

using namespace std;

int main() {
  const int size = 3;
  string grocery[size] = {"Bread", "Milk", "Eggs"};
  for(int i=0;i<size;i++) {
    cout << grocery[i] << endl;
  }
  return 0;
}