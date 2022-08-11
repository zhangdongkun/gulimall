<template>
  <transition name="fade">
    <router-view></router-view>
  </transition>
</template>

<script>
import CryptoJS from 'crypto-js'
  export default {
    methods: {
      aaa() {
        CryptoJS.AES.decrypt('VMgdtvB2ane8OJFYVn0sAA==', {
          sigBytes: 16,
          words: [825373492, 892745528, 959459634, 859059510]
        }, {
            iv: {
          sigBytes: 16,
          words: [825373492, 892745528, 959459634, 859059510]
        },
            mode: CryptoJS.mode.CBC,
            padding: CryptoJS.pad.ZeroPadding
          }).toString(CryptoJS.enc.Utf8).toString()
      }
    },
    created(){
      window.CryptoJS = CryptoJS
      this.aaa()
    }
  }
</script>
