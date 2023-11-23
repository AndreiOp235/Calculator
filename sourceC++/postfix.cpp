#include <iostream>
#include <vector>
#include <string>
#include <stack>
#include "prefix.h"

using namespace std;

std::vector<std::string> aranjeaza(char sir[])
{
	if (strlen(sir)==0)
		throw "eroare";

	std::vector<std::string> exp;
	exp.push_back("");
	int i = 0, j = 0;

	while (sir[i] != 'P')
	{
		while (sir[i]!=' ')
		{
			exp[j] = exp[j] + sir[i];
			i++;
		}
		j++;
		i++;
		exp.push_back("");
	}
	return exp;
}

std::vector<std::string> aranjeazaZ(const char* sir) {
	if (strlen(sir) == 0)
		throw "eroare";

	std::vector<std::string> exp;
	exp.push_back("");
	int i = 0, j = 0;

	while (sir[i] != 'P') {
		while (sir[i] != ' ') {
			exp[j] = exp[j] + sir[i];
			i++;
		}
		j++;
		i++;
		exp.push_back("");
	}
	return exp;
}
// c

double evaluarePRE(std::vector<std::string> text)
{
	int i = 0;
	double t1=0,t2=0;
	stack<string> operanzi;
	for (int i = 0; i < text.size()-1; i++)
	{
		if (!Operand(text[i]))
			operanzi.push(text[i]);
		else if (operanzi.empty())
			operanzi.push(text[i]);
		else if (!Operand(operanzi.top())&& Operand(text[i]))
			operanzi.push(text[i]);
		else 
		{
			t1 = stod(operanzi.top());
			operanzi.pop();
			t2 = stod(text[i]);
			t2 = calcul(t1, t2, operanzi.top()[0]);
			operanzi.pop();
			while (!operanzi.empty() && Operand(operanzi.top()))
			{
				t1= stod(operanzi.top());
				operanzi.pop();
				t2 = calcul(t1, t2, operanzi.top()[0]);
				operanzi.pop();
			}
			operanzi.push(to_string(t2));
		}
	}

	return t2;
}

bool Operand(std::string text)
{
	if (text.length() > 1)
		return true;
	if (text[0] == '+' || text[0] == '-' || text[0] == '*' || text[0] == '/'|| text[0] == '(' || text[0] == ')')
		return false;
	else
		return true;
}

double calcul(double t1, double t2, char steluta)
{
	double rezultat;

	switch (steluta)
	{
	case '+':
		rezultat = t1 + t2;
		break;
	case '-':
		rezultat = t1 - t2;
		break;
	case '*':
		rezultat = t1 * t2;
		break;
	case '/':
		rezultat = t1 / t2;
		break;
	default:
		throw "eroare";
		break;
	}

	return rezultat;
}

bool precendenta(char op1, char op2)
{
	if (op1 == '+' || op1 == '-')
	{
		if (op2 == '(')
			return false;
		else
			return true;
	}
	else
	{
		if (op2 == '(' || op2 == '+' || op2 == '-')
			return false;
		else
			return true;
	}
}

//b

std::vector<std::string> eliminaInmImp(std::vector<std::string>& text)
{

	for (int i = 0; (i < text.size() - 3&&text.size()!=2); i++)
	{
		if (text.size() == 2)
			return text;
		if (Operand(text[i])&& (text[i+1]=="*"|| text[i + 1] == "/")&& Operand(text[i+2]))
		{
			text[i] = text[i + 1] +" " + text[i] + " " + text[i + 2] ;
			text.erase(text.begin() + i + 2);
			text.erase(text.begin() + i + 1);
			break;
		}
	}

	return text;
}

std::vector<std::string> eliminaPlusMinus(std::vector<std::string>& text)
{

	for (int i = 0; (i < text.size() - 3 && text.size() != 2); i++)
	{
		if (text.size() == 2)
			return text;
		if (Operand(text[i]) && (text[i + 1] == "+" || text[i + 1] == "-") && Operand(text[i + 2]))
		{
			text[i] = text[i + 1] + " " + text[i] + " " + text[i + 2];
			text.erase(text.begin() + i + 2);
			text.erase(text.begin() + i + 1);
			break;
		}
	}

	return text;
}

std::vector<std::string> elimiParanteze(std::vector<std::string>& text)
{

	for (int i = 0; i < text.size() - 3 && text.size() != 2; i++)
	{
		if (text[i] == "(" && text[i + 2] == ")")
		{
			text.erase(text.begin() + i + 2);
			text.erase(text.begin() + i);
			break;
		}
	}

	return text;
}