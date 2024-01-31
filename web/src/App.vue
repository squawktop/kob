<template>
  <div>
    <div>Bot昵称：{{bot_name}}</div>
    <div>Bot战力：{{ bot_rating }}</div>
  </div>
  <router-view></router-view>
</template>


<script>
import $ from 'jquery';
import { ref } from 'vue';



export default {
  name: "App",
  setup: () => {

    $.ajax({
      url: "http://127.0.0.1:3000/pk/getbotinfo/",
      type: "get",
      success: resp => {
        // console.log(resp)
        bot_name.value = resp.name; 
        bot_rating.value = resp.rating;
      }
    })
    let bot_name = ref("");
    let bot_rating = ref("");
    return {
      bot_name,
      bot_rating
    }
  }
}
</script>



<style>
body{
  margin:0px;
  background: url("@/assets/background.jpg") no-repeat;
  background-size:100% 100%;
  background-attachment:fixed;

  /* background-image: url("@/assets/background.jpg");
  background-repeat: no-repeat;
  background-size: cover; */
}
</style>
