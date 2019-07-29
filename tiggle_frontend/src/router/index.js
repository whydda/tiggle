import Vue from 'vue'
import Router from 'vue-router'
import HelloWorld from '@/components/HelloWorld'
import HelloWorld2 from '@/components/HelloWorld2'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'HelloWorld',
      component: HelloWorld
    },
    {
      path: '/hello2',
      name: 'HelloWorld2',
      component: HelloWorld2
    }
  ]
})

// // router 객체생성
// const router = new VueRouter({
//   routes
// });
//
// new Vue({
//   render: h => h(App),
//   router // router 추가
// }).$mount('#app')
