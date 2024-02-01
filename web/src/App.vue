<template>
  <NavBar />
  <router-view></router-view>
</template>


<script>
import NavBar from "@/components/NavBar.vue";
import "bootstrap/dist/css/bootstrap.min.css";
import "bootstrap/dist/js/bootstrap";

export default {
  components: {
    NavBar,
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
