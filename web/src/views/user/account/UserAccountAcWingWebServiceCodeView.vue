<template>
    <div></div>
</template>

<script>
import router from '@/router/index';
import { useRoute } from 'vue-router';
import { useStore } from 'vuex';
import $ from 'jquery'

export default {
    setup() {
        const myroute = useRoute();
        const store = useStore();

        $.ajax({
            url: "https://app2703.acapp.acwing.com.cn/api/user/account/acwing/web/receive_code",
            type: "GET",
            data: {
                code: myroute.query.code,
                state: myroute.query.state,
            },
            success: resp => {
                if (resp.result === "success") {
                    localStorage.setitem("jwt token", resp.jwt_token);
                    store.commit("updateToken", resp.jwt_token);
                    router.push({ name: "home" });
                    store.commit("updatePullingInfo", false);
                } else {
                    router.push({ name: "user_account_login" });
                }
            }
        })
    }
}
</script>
<style scoped></style>