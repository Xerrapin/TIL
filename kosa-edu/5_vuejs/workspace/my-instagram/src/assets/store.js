// store.js
import {
    createStore
} from 'vuex'
import axios from 'axios';

const store = createStore({
    state() { // 데이터보관하고 싶으면 여기에 기재
        return {
            name: 'doyeon',
            age: 22,
            likes: 0,
            isLike: false,
            more: {},
            gender: 'F',
        }
    },

    actions: { // ajax 넣는곳, 오래 걸리는 작업들 넣는곳
        getMore(context) {
            axios.get(`https://raw.githubusercontent.com/ai-edu-pro/busan/main/more0.json`)
                .then(result => {
                    console.log(result.data);
                    context.commit('setMore', result.data)
                })
        }
    },
    mutations: { // 변경하길 원하는 것들은 이곳에다가 기재한다
        setMore(state, data) { // actions후에 state 변경 --> mutations에서 변경한다.
            state.more = data
        },
        // namechange(state){
        namechange(state, data) {
            // state.name = 'kang gamchan';
            state.name = data;
        },
        ageinc(state, data) { // 원하는 데이터도 넘겨 받을 수 있다.
            // state.age++
            state.age += data
        },
        like(state) {
            if (state.isLike == false) {
                state.likes++;
                state.isLike = true;
            } else {
                state.likes--;
                state.isLike = false;
            }
        }
    },

})

export default store;