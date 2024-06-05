//
// Created by Balu on 25.05.2024.
//

#ifndef CUSTOMPOLYNOMIAL_CUSTOMPOLYNOMIAL_H
#define CUSTOMPOLYNOMIAL_CUSTOMPOLYNOMIAL_H

#include <vector>
#include <ostream>
#include <iostream>

template <typename B>
class CustomPolynomial {
private:
    std::vector<B> coefficients;

public:
    // default constructor
    CustomPolynomial();

    // constructor with parameter
    explicit CustomPolynomial(const std::vector<B>& coefficients);

    // constructor with parameter
    explicit CustomPolynomial(const std::string& filePath);

    // copy
    CustomPolynomial(const CustomPolynomial<B> &other);

    // destructor
    ~CustomPolynomial();

    // sum of two CustomPolynomials
    CustomPolynomial<B> operator+(const CustomPolynomial<B> &other) const;

    // subtraction of two CustomPolynomials
    CustomPolynomial<B> operator-(const CustomPolynomial<B> &other) const;

    // multiplication of two CustomPolynomials
    CustomPolynomial<B> operator*(const CustomPolynomial<B> &other) const;

    // left / right multiplication by a scalar
    CustomPolynomial<B> operator*(B other) const;

    // checking the equality between 2 CustomPolynomials
    bool operator=(const CustomPolynomial<B> &other);

    // return rate specified grade monomer
    B &operator[](int index);

    // display CustomPolynomial
    template <typename Balu>
    friend std::ostream &operator<<(std::ostream &os, const CustomPolynomial<Balu> &customPolynomial);

    // reading the coefficients of the keyboard
    template <typename Balu>
    friend std::istream &operator>>(std::istream& is, CustomPolynomial<Balu>& customPolynomial);

    int getBiggerSize(const CustomPolynomial<B> &other) const;

    // get type method for finding the CustomPolynomial degree
    int getGrd();

    // calculate the CustomPolynomial for a given x
    B Calculate(B x);

    // get the private vector of coefficients
    std::vector<B> getCoefficients() const;

    // set the private vector of coefficients
    void setCoefficients(std::vector<B> coefficients);

};

template<typename B>
void CustomPolynomial<B>::setCoefficients(std::vector<B> coefficients) {
    this->coefficients = coefficients;
}

template<typename B>
B CustomPolynomial<B>::Calculate(B x) {
    B sum = 0;
    for (int i = 0; i < coefficients.size(); i++)
    {
        sum = coefficients[i] * pow(x, i);
    }

    return sum;
}

template<typename B>
int CustomPolynomial<B>::getGrd() {
    return getCoefficients().size() - 1;
}

template<typename B>
int CustomPolynomial<B>::getBiggerSize(const CustomPolynomial<B>& other) const {
    if (this->coefficients.size() < other.getCoefficients().size())
    {
        return other.getCoefficients().size();
    }
    else
    {
        return this->coefficients.size();
    }
}

template<typename B>
CustomPolynomial<B>::CustomPolynomial()
{
    coefficients = coefficients(1,0);
}

template<typename B>
CustomPolynomial<B>::CustomPolynomial(const std::vector<B>& coefficients)
{
    this->coefficients = coefficients;
}

template<typename B>
CustomPolynomial<B>::CustomPolynomial(const std::string& filePath)
{
    this->coefficients = coefficients;
}

template<typename B>
CustomPolynomial<B>::CustomPolynomial(const CustomPolynomial<B>& other)
{
    this->coefficients = other.getCoefficients();
}

template<typename B>
CustomPolynomial<B>::~CustomPolynomial()
{
    this->coefficients.clear();
}

template<typename B>
CustomPolynomial<B> CustomPolynomial<B>::operator+(const CustomPolynomial<B>& other) const
{
    std::vector<B> result(getBiggerSize(other), 0);

    for (int i = 0; i < result.size(); i++)
    {
        // if polynomial1 has the size smaller than our i, the coeff[i] will be added to the result[i]
        if (i < coefficients.size()) result[i] += this->coefficients[i];

        // if polynomial2 has the size smaller than our i, the coeff[i] will be added to the result[i]
        // Obs: if the result[i] already has a value, then the new value is added
        if (i < other.coefficients.size()) result[i] += other.coefficients[i];
    }

    return CustomPolynomial<B>(result);
}

template<typename B>
CustomPolynomial<B> CustomPolynomial<B>::operator-(const CustomPolynomial<B>& other) const
{
    std::vector<B> result(getBiggerSize(other), 0);

    for (int i = 0; i < result.size(); i++)
    {

        if (i < coefficients.size()) result[i] += this->coefficients[i];


        if (i < other.coefficients.size()) result[i] -= other.coefficients[i];
    }
    return CustomPolynomial<B>();
}

template<typename B>
CustomPolynomial<B> CustomPolynomial<B>::operator*(const CustomPolynomial<B>& other) const
{

    std::vector<B> result(coefficients.size() + other.coefficients.size() - 1, 0);
    for (int i = 0; i < coefficients.size(); ++i)
    {
        for (int j = 0; j < other.coefficients.size(); ++j)
        {
            result[i + j] += coefficients[i] * other.coefficients[j];
        }
    }
    return CustomPolynomial<B>();
}

template<typename B>
CustomPolynomial<B> CustomPolynomial<B>::operator*(B other) const
{
    std::vector<B> result(coefficients.size());
    for (int i = 0; i < coefficients.size(); ++i)
    {
        result[i] = coefficients[i] * other;

    }
    return CustomPolynomial<B>();
}

template<typename B>
bool CustomPolynomial<B>::operator=(const CustomPolynomial<B>& other)
{
    if (coefficients.size() != other.coefficients.size())
    {
        return false;
    }
    for (int i = 0; i < coefficients.size(); ++i)
    {
            if (coefficients[i] != other.getCoefficients()[i]) {
                return false;
            }
    }
    return true;
}

template<typename B>
B& CustomPolynomial<B>::operator[](int index)
{
    if (index >= coefficients.size()) {
        // Handle out-of-range access, for example, throw an exception
        throw std::out_of_range("Index out of range");
    }
    return coefficients[index];
}


template<typename B>
std::vector<B> CustomPolynomial<B>::getCoefficients() const
{
    return coefficients;
}

template<typename Balu>
std::ostream &operator<<(std::ostream &os, const CustomPolynomial<Balu> &customPolynomial) {
    for (int i = customPolynomial.getCoefficients().size() - 1; i >= 0; --i) {
        if (customPolynomial.getCoefficients()[i] != 0) {
            if (i < customPolynomial.getCoefficients().size() - 1 && customPolynomial.getCoefficients()[i] > 0) {
                os << "+ ";
            }
            os << customPolynomial.getCoefficients()[i];
            if (i > 1) {
                os << "x^" << i << " ";
            }
            else if (i > 0) {
                os << "x ";
            }
        }
    }
    return os;
}

template<typename Balu>
std::istream &operator>>(std::istream &is, CustomPolynomial<Balu> &customPolynomial) {

    Balu coeff;
    std::vector<Balu> coeffs;
    while (is >> coeff && coeff != '#') {
        coeffs.push_back(coeff);
    }
    customPolynomial = CustomPolynomial<Balu>(coeffs);
    return is;
}


#endif //CUSTOMPOLYNOMIAL_CUSTOMPOLYNOMIAL_H
