#include <iostream>
#include <vector>
#include <string>
#include <cstring>
#include <fstream>  // Include the necessary header for file operations
#include "prefix.h"

using namespace std;

void main()
{
    ifstream inputFile("in.txt");
    cin.rdbuf(inputFile.rdbuf());

    // Redirect cout to write to "out.txt"
    ofstream outputFile("out.txt");
    cout.rdbuf(outputFile.rdbuf());

   //b
   //cout << "Introduceti forma infixata de evaluat." << endl;
   char sirB[100];
   cin.getline(sirB, 100);

   vector<string> sirCb;

   sirCb = aranjeaza(sirB);
   bool flag = false;

   do
   {
       flag = false;
       while (sirCb.size() != elimiParanteze(sirCb).size())
           flag = true;
       while (sirCb.size() != eliminaInmImp(sirCb).size())
           flag = true;
       while (sirCb.size() != eliminaPlusMinus(sirCb).size())
           flag = true;
   } while (flag);

   vector<string> forma;
   forma = aranjeazaZ((sirCb[0]+" P").c_str());

   double rezultat = evaluarePRE(forma);

   if (rezultat == INFINITY)
       cout << "Eroare impartire la zero!";
   else
       cout <<  rezultat;



   inputFile.close();
   outputFile.close();

   //return 0;
}

