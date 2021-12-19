<template>
    <div>
        <div v-for="(board,i) in dataname" :key="i">
            <h5>{{board.title}}</h5>
            <p>{{board.date}}</p>
        </div>
    </div>
</template>

<script>
    export default {
        name:"list",
        props:{
            dataname:Array
        }
    }
</script>

<style>

</style>