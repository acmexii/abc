
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import AbcManager from "./components/listers/AbcCards"
import AbcDetail from "./components/listers/AbcDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/abcs',
                name: 'AbcManager',
                component: AbcManager
            },
            {
                path: '/abcs/:id',
                name: 'AbcDetail',
                component: AbcDetail
            },



    ]
})
