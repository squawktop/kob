<template>
  <NavBar />
  <router-view></router-view>
</template>


<script>
import NavBar from "@/components/NavBar.vue";
import "bootstrap/dist/css/bootstrap.min.css";
import "bootstrap/dist/js/bootstrap";
// import $ from "jquery";

export default {
  components: {
    NavBar,
  },
  setup() {
    // 发送 POST 请求


    //   $.ajax({
    //     url: "http://127.0.0.1:3000/user/account/info/",
    //     type: "get",
    //     headers: {
    //       Authorization:
    //         "Bearer " +
    //         "eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJjYzVkYjdmM2Q1MjU0ZDFlOWIzZTVkNzRiMzhhMDkzMCIsInN1YiI6IjIiLCJpc3MiOiJzZyIsImlhdCI6MTcwNzExNTE1MCwiZXhwIjoxNzA4MzI0NzUwfQ.FRtWhMYr6wIGWPJmzFA8krKkrjYpcJka_l5P7ox4u44",
    //     },
    //     success(resp) {
    //       console.log(resp);
    //     },
    //     error(resp) {
    //       console.log(resp);
    //     },
    //   });

    //   $.ajax({
    //     url: "http://127.0.0.1:3000/user/account/register/",
    //     type: "post",
    //     data: {
    //       username: "yxc2",
    //       password: "123",
    //       confirmedPassword: "123",
    //     },
    //     success(resp) {
    //       console.log(resp);
    //     },
    //     error(resp) {
    //       console.log(resp);
    //     },
    //   });
  },
};
</script>



<style>
body {
  margin: 0px;
  background: url(" @/assets/images/background.jpg") no-repeat;
  background-size: 100% 100%;
  background-attachment: fixed;

  /* background-image: url("@/assets/background.jpg");
  background-repeat: no-repeat;
  background-size: cover; */
}
</style>
