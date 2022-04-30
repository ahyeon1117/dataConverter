<template>
  <div class="mainArea">
    <div class="selectBox">
      <h3 @click="dataFlagOn">DATA</h3>
      <h3 class="bLBlue" @click="fileFlagOn">FILE</h3>
    </div>
    <div class="mgT16">
      <div>Type</div>
      <select name="" id="">
        <option v-for="(item, index) in dataType" :key="index">
          {{ item }}
        </option>
      </select>
    </div>
    <div class="mgT16">
      <div>Target Type</div>
      <select name="" id="">
        <option v-for="(item, index) in dataType" :key="index">
          {{ item }}
        </option>
      </select>
    </div>
    <div class="mgT16">
      <div v-if="dataFlag">
        <div>data</div>
        <textarea />
      </div>
      <div v-if="fileFlag">
        <div>file</div>
        <input type="file" />
      </div>
    </div>
  </div>
</template>
<script>
export default {
  name: "InputTable",
  data() {
    return {
      dataType: ["CSV", "JSON"],
      fileFlag: false,
      dataFlag: true
    };
  },
  methods: {
    fileFlagOn() {
      this.dataFlag = false;
      this.fileFlag = true;
    },
    dataFlagOn() {
      this.dataFlag = true;
      this.fileFlag = false;
    }
  }
};
</script>
