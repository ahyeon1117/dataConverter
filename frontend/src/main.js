import Vue from "vue";
import i18n from "./i18n";
import App from "./App.vue";
import router from "./router";
import css from "./assets/css/common.css";
import { createProvider } from "./vue-apollo";

Vue.config.productionTip = false;

new Vue({
  css,
  i18n,
  router,
  apolloProvider: createProvider(),
  render: h => h(App)
}).$mount("#app");
