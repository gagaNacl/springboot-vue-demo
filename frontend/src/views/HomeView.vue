<script>
export default {
  data() {
    return {
      message: '你好，世界！',
      number: 1,
    }
  },
}
</script>

<template>
  <h3>模板语法</h3>
  <p>{{ message }}</p>
  <p>{{ number }}</p>
  <p>{{ number + 1 }}</p>
</template>

<style></style>
