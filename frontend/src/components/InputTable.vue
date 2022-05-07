<template>
  <div>
    <div class="layout primaryBackground">
      <div class="layoutArea">
        <h1 style="text-align: start" class="mgB16">INPUT</h1>
        <div class="layoutSubArea df">
          <textarea></textarea>
          <div class="fwb">
            <div>
              SrcType
              <select v-model="selectSrcType">
                <option value="EXCEL">EXCEL</option>
              </select>
            </div>
            <div>
              TargetType
              <select v-model="selectTargetType">
                <option value="EXCEL">EXCEL</option>
              </select>
            </div>
          </div>
        </div>
        <div class="mgT16">
          <button class="submit" @click="process">PROCESS</button>
        </div>
      </div>
    </div>
    <div v-if="flag" class="layout secondaryBackground">
      <div class="layoutArea">
        <label>Result</label>
        <div class="layoutSubArea df">
          <textarea></textarea>
        </div>
      </div>
    </div>
  </div>
</template>
<script>
export default {
  name: "InputTable",
  data() {
    return {
      selectSrcType: null,
      selectTargetType: null,
      flag: false
    };
  },
  methods: {
    process() {
      this.flag = true;
    }
  }
};
</script>
