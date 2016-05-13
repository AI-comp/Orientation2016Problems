/* Solution for Primes */

#include <iostream>
using namespace std;

#define MAX 10000

// sieve of Eratosthenes
void make_list(bool *arr, int sz){
  for(int i=0; i<=sz; i++) arr[i] = true;
  arr[0] = arr[1] = false;

  for(int i=2; i<=sz/2; i++){
    if(arr[i]){
      for(int j=i*2; j<=sz; j+=i){
	arr[j] = false;
      }
    }
  }
  return;
}

int main(){
  // initialize prime list
  bool is_prime[MAX+1];
  make_list(is_prime, MAX);

  int n;
  while(cin >> n, n!=0){
    bool flag = false;
    for(int i=2; i*i<=n; i++){
      if(is_prime[i] && n%i==0 && is_prime[n/i]){
	flag = true;
	break;
      }
    }
    if( flag ){
      cout << "YES" << endl;
    } else {
      cout << "NO" << endl;
    }
  }  
  return 0;
}
