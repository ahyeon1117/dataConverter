<template>
  <div class="wrap">
    <div class="login">
      <div class="login_id">
        <h4>{{ $t("login.email") }}</h4>
        <input v-model="id" type="email" placeholder="Email" />
      </div>
      <div class="login_pw">
        <h4>{{ $t("login.password") }}</h4>
        <input v-model="password" type="password" placeholder="Password" />
      </div>
      <div class="login_etc">
        <div class="forgot_pw">
          <a href="">{{ $t("login.forgotPassword") }}</a>
        </div>
      </div>
      <div class="submit">
        <button class="submit" @click="login">{{ $t("login.login") }}</button>
      </div>

      <div class="mgT16">{{ $t("login.register") }}</div>
    </div>
  </div>
</template>

<script>
export default {
  name: "Login",
  data() {
    return {
      id: null,
      password: null
    };
  },
  methods: {
    login() {
      console.log("login");
      this.$router.push(this.$route.query.redirect || "/mainPage");
    }
  }
};
</script>
