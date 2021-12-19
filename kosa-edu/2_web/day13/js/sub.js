import getType from './test';

console.log(typeof 'Hello World!!') // string
console.log(typeof 123) // number
console.log(typeof true) // boolean
console.log(typeof undefined) // undefined
console.log(typeof null) // object
console.log(typeof {}) // object
console.log(typeof []) // object


console.log(getType(123));
console.log(getType(false));
