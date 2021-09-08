// HTML 요소(Elements) 1개씩 찾기
const boxEl = document.querySelector('.box');

// HTML 요소 모두 검색/찾기
let boxEls = document.querySelectorAll('.box');
console.log("boxEls" + boxEls);

// 찾은 요소를 반복해서 함수 실행
// 익명 함수를 인수로 추가
boxEls.forEach(function() {});

// 첫 번째 매개변수(boxEl) : 반복 중인 요소
// 두 번째 매개변수(index) : 반복 중인 번호
boxEls.forEach(function(boxE, index) { });

// 출력
boxEls.forEach(function(boxE, index) { 
    boxE.classList.add(`order-${index + 1}`);
    console.log(index, boxE);
});

// HTMl 요소에 적용할 수 있는 메소드
// boxEl.addEventListener();

// 인수(Alguments)를 추가 가능
// boxEl.addEventListener(1, 2);

// 1 - 이벤트(Event, 상황)
// boxEl.addEventListener('click', 2);

// 2 - 핸들러(Handler, 실행할 함수)
boxEl.addEventListener('click', function() {
    alert('눌렀네요.');
    console.log('Click~~~');
});

// 요소의 클래스 정보 객체 활용
boxEl.classList.add('active');
console.log(
    boxEl.classList.contains('active')
);

boxEl.classList.remove('active');
let isContains = boxEl.classList.remove('active');
console.log(isContains);

// 요소가 갖고 있는 텍스트(값)을 가져오거나(get), 세팅(set) 할 수 있다.
const boxEl2 = document.querySelector('.box');

// Getter, 값을 얻는 용도
console.log(boxEl2.textcontent);

// Setter, 값을 지정하는 용도s
boxEl2.textContent = 'HappyVirus!!!';
console.log(boxEl2.textcontent);

const str = 'I-ON';
// split : 문자를 인수 기준을 쪼개서 배열로 반환
// reverse : 배열을 뒤집기
// join : 배열을 기준으로 문자로 병합해 반환

const str2 = str.split('').reverse().join(''); // 메소드

console.log(str)
console.log(str2)






