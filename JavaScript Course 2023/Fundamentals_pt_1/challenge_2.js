// const firstName = 'kim';
// const job = 'programmer';
// const birthYear = 1997;
// const year = 2037;

// const kim = "I'm" + firstName + ', a ' + (year - birthYear) + ' year old ' + job + '!';

// console.log(kim);

// const kimNew = `I'm ${firstName}, a ${year - birthYear} year old ${job}!`;

// console.log(kimNew);

// console.log('String with \n\
// multiple \n\
// lines');

// console.log(`String
// multiple
// lines
// `) // 백틱을 쓰면 \n\이 필요없다

const age = 19;
const isOldEnough = age >= 18;

if(isOldEnough) {
    console.log('Kim can start driving license')
} else {
    const yearsLeft = 18 - age;
    console.log(`Kim is too young. Wait another ${yearsLeft} years:)`);
}

const birthYear = 1991;
let century; //if, else 블록 밖에서 변수를 정의한다
if(birthYear <= 2000) {
    let century = 20; // 블록 내부에서 선언된 변수는 블록 밖에서는 액세스할 수 없다
} else {
    let century = 21;
}
    console.log(century);

// challenge

// const massMark = 78;
// const heightMark = 1.69;
// const massJohn = 92;
// const heightJohn = 1.95;

// const BMIMark = massMark / (heightMark * heightMark);
// const BMIJohn = massJohn / (heightJohn * heightJohn);
// console.log(BMIMark, BMIJohn);

// /* Write your code below. Good luck! 🙂 */

// if(BMIMark > BMIJohn) {
//     console.log("Mark's BMI is higher than John's!");
//     console.log(`Mark's BMI ${BMIMark} is higher than John's ${BMIJohn}!`);
// } else {
//     console.log("John's BMI is higher than Mark's!");
//     console.log(`John's BMI ${BMIJohn} is higher than Mark's ${BMIMark}!`);
// }

