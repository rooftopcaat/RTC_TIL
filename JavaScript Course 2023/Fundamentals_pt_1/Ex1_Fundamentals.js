
const inputYear = '1991';
// must be convert string to number
// type conversion (명시적)
console.log(Number(inputYear), inputYear);
console.log(Number(inputYear) + 18);

// type coercion (묵시적)
console.log('I am ' + 23 + ' years old');
console.log('I am ' + '23' + ' years old'); //same
console.log('23' - '10' - 3); // - 연산자에 의해 str가 int로 전환된다
console.log('23' + '10' + 3); // + 더하기의 경우 23103으로 string이 출력된다
console.log('23' * '2');

let n = '1' + 1;
n = n - 1;
console.log(n);

// 강압적 형변환을 잘 사용하면 코드 길이가 짧아진다

// 5 falsy values: 0, '', undefined, null, NaN

console.log(Boolean(0));
console.log(Boolean(undefined));
console.log(Boolean('Kim'));
console.log(Boolean({}));
console.log(Boolean(''));

//실제로는 안 쓰인다

const money = 0;
if (money) {
    console.log("Don't spend it all :)");
} else {
    console.log('You should get a job!');
}

let height;
if (height) {
    console.log('Yes! Height is defined');
} else {
    console.log('Height is UNDEFINED')
}