var sum = 0;

for(var i = 0; i < 34; i++){
  var x = findFibonacci(i);
  if(x % 2 == 0){
    sum += x;
  }
}

console.log(sum);


function findFibonacci(num){

  if(num == 1) {return 0;}
  if(num <= 2) {return 1;}

  else {
    return (findFibonacci(num - 1) + findFibonacci(num - 2));
  }
}
