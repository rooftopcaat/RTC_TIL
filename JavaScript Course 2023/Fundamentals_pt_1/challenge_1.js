let massMark = 78;
let massJohn = 92;
let heightMark = 169;
let heightJohn = 195;
let BMIMark = massMark / (heightMark * heightMark);
let BMIJohn = massJohn / (heightJohn * heightJohn);
let markHigherBMI = BMIMark > BMIJohn;
console.log(markHigherBMI);