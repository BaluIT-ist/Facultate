//
// Created by Balu on 25.05.2024.
//

#include <iostream>
//#include <unistd.h>
#include <map>
#include "../MenuEnum.h"
#include "TypeMenu.cpp"
#include "../headers/CustomPolynomial.h"

class MenuHelper {
private:
    static std::map<std::string,CustomPolynomial<unsigned int>> naturalPolynomials;
    static std::map<std::string,CustomPolynomial<int>> integerPolynomials;
    static std::map<std::string,CustomPolynomial<double>> realPolynomials;
public:
    static void initMenu() {
        int option;
        do {
            printInitMenu();
            std::cin>>option;
            switch(option)
            {
                case MenuEnum::READ_FREOM_FILE:
//                    optionReadFromFile();
                    break;
                case MenuEnum::READ:
//                    optionRead();
                    break;
                case MenuEnum::HELP:
                    optionHelp();
                    break;
                case MenuEnum::EXIT:
                    optionExit();
                    break;
                default :
                    std::cout<<"\n\nIncorrect option !";
            }
            std::cin.get();
        }while('a');
    }

    static void getFullMenu() {
        int option;
        do {
            printFullMenu();
            std::cin>>option;
            switch(option)
            {
//                case MenuEnum::READ_FREOM_FILE:
//                    optionReadFromFile();
//                    break;
//                case MenuEnum::READ:
//                    optionRead();
//                    break;
//                case MenuEnum::SUM:
//                    optionSum();
//                    break;
//                case MenuEnum::SUBSTRACTION:
//                    optionSubtraction();
//                    break;
//                case MenuEnum::MULTIPLICATION:
//                    optionMultiplication();
//                    break;
//                case MenuEnum::MULTIPLICATION_SCALAR:
//                    optionMultiplicationScalar();
//                    break;
//                case MenuEnum::EQUALITY:
//                    optionEquality();
//                    break;
//                case MenuEnum::COEFFICIENT:
//                    optionCoefficient();
//                    break;
//                case MenuEnum::DEGREE:
//                    optionDegree();
//                    break;
//                case MenuEnum::CALCULATE:
//                    optionCalculate();
//                    break;
                case MenuEnum::HELP:
                    optionHelp();
                    break;
                case MenuEnum::EXIT:
                    optionExit();
                    break;
                default :
                    std::cout<<"\n\nIncorrect option !";
            }
            std::cin.get();
        }while('a');
    }

private:
    static void printFullMenu() {
        system("cls"); // cleaning window

        std::cout<<"\n\n1. Read polynomial from file.";
        std::cout<<"\n\n2. Write polynomial";
        std::cout<<"\n\n3. Sum of two polynomials";
        std::cout<<"\n\n4. Subtraction of two polynomials";
        std::cout<<"\n\n5. Multiplication of two polynomials";
        std::cout<<"\n\n6. Multiplication by a scalar";
        std::cout<<"\n\n7. Checking the equality between two polynomials";
        std::cout<<"\n\n8. Rate specified grade monomer of polynomial";
        std::cout<<"\n\n9. Find the polynomial degree";
        std::cout<<"\n\n10. Calculate polynomial for a given \'x\'";
        std::cout<<"\n\n11. Help";
        std::cout<<"\n\n12. Exit";
        std::cout<<"\n\nInput your option:";
    }

    static void printInitMenu() {
        system("cls"); // cleaning window

        std::cout<<"\n\n1. Read polynomial from file.";
        std::cout<<"\n\n2. Write polynomial";
        std::cout<<"\n\n11. Help";
        std::cout<<"\n\n12. Exit";
        std::cout<<"\n\nInput your option:";
    }

    static void printBackMenu() {

        std::cout<<"\n\n11. Help";
        std::cout<<"\n\n12. Exit";
        std::cout<<"\n\nInput your option:";
    }

//    static void optionRead() {
//        std::string polyName;
//        std::string type = TypeMenu::typeMenu();
//
//        std::cout << "\n\nEnter the polynomial name: ";
//        std::cin >> polyName;
//        std::cout << "\n\n";
//
//        if (type == "unsigned int") {
//            CustomPolynomial<unsigned int> poly = new CustomPolynomial<unsigned int> ();
//            std::cin >> poly;
//            naturalPolynomials[polyName] = poly;
//        } else if (type == "int") {
//            CustomPolynomial<int> poly();
//            std::cin >> poly;
//            integerPolynomials[polyName] = poly;
//        } else if (type == "double") {
//            CustomPolynomial<double> poly();
//            std::cin >> poly;
//            realPolynomials[polyName] = poly;
//        }
//
//        optionBack();
//    }

    static void optionHelp() {
        system("cls");
        std::cout<<"This project involves defining a generic Polynomial class to represent polynomials of any degree "
                   "with coefficients of any numeric type. The class must provide a range of functionalities, including "
                   "various constructors, binary operators, scalar multiplication, and methods for polynomial "
                   "evaluation and degree determination.";

        optionBack();
    }

    static void optionExit() {
        std::cout<<"\nCompleted!\n";
        std::cin.ignore(1);
        std::cin.get();
        exit(0);
    }

    static void optionBack() {
        int option;
        do {
            printBackMenu();
            std::cin>>option;
            switch(option)
            {
                case 1:
                    break;
                case 2:
                    break;
                case 12:
                    std::cout<<"\nCompleted!\n";
                    std::cin.ignore(1);
                    std::cin.get();
                    exit(0);
                default : std::cout<<"\n\nIncorrect option !";
            }
            std::cin.get();
        }while('a');
    }
};


