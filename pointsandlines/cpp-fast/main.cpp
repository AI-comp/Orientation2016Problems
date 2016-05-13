/* Solution for "Points and Lines" */

#include <iostream>
#include <vector>
#include <algorithm>  //sort, max

using namespace std;

#define EPS 1e-5

int main(){
  int d;
  cin >> d;
  while(d-- > 0){
    int n;
    cin >> n;

    vector<pair<int, int> > point(n);
    for(int i=0; i<n; i++){
      int x, y;
      cin >> x >> y;
      point[i] = make_pair(x, y);
    }
    int result = 2;

    for(int i=0; i<n; i++){
      // calculate slope around point[i]
      vector<double> slope;
      int count_inf = 1;
      for(int j=i+1; j<n; j++){
	if(point[i].first == point[j].first){
	  // if x are same (parallel to y axis), slope is not calculated
	  // so count these another way
	  count_inf++;
	  continue;
	}
	slope.push_back((double)(point[i].second - point[j].second)
			/ (point[i].first - point[j].first));
      }
      result = max(result, count_inf);

      // count number of same slopes
      sort(slope.begin(), slope.end());
      int reps = slope.size();
      int idx = 0;
      while( idx < reps-1 ){
	int top = idx + 1;
	// section [idx,top) contains same slope
	// using not "==" but EPS, because slope is floating point
	while( top<reps && (slope[top]-slope[idx])<EPS ) top++;
	result = max(result, top-idx+1);
	idx = top;
      }
    }

    cout << result << endl;
  }
  return 0;
}
