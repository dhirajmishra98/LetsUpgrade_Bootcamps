#include <bits/stdc++.h>
using namespace std;

bool checkPrime(int x)
{
    if (x == 1 || x == 0)
        return false;
    for (int i = 2; i < x; i++)
    {
        if (x % i == 0)
            return false;
    }
    return true;
}
int main()
{
    int x;
    cout << "enter a number : ";
    cin >> x;
    cout << checkPrime(x);
    return 0;
}