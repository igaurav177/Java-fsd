


function isPrime(num) {
   if (num <= 1) return false;
   for (var i = 2; i <= Math.sqrt(num); i++) {
      if (num % i === 0) {
        alert("The sum is a prime number.");
      }
   }
   return true;
}

var num = parseInt(window.prompt("Enter the number","0"))
    if (isPrime(sum)) {
      alert("prime number")
    } else {
     alert("number is not prime")
    }