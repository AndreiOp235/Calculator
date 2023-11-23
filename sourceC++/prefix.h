#pragma once

std::vector < std::string> aranjeaza(char sirC[]);
double evaluarePRE(std::vector < std::string> text);
bool Operand(std::string text);

double calcul(double t1, double t2, char steluta);
bool precendenta(char op1, char op2);

std::vector<std::string> elimiParanteze(std::vector<std::string>& text);
std::vector<std::string> eliminaInmImp(std::vector<std::string>& text);
std::vector<std::string> eliminaPlusMinus(std::vector<std::string>& text);
std::vector<std::string> aranjeazaZ(const char* sir);

