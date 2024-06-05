document.addEventListener("DOMContentLoaded", function() {
  var categories = document.querySelectorAll("nav ul li");
  categories.forEach(function(category) {
    category.addEventListener("click", function() {
      var content = document.querySelector(".category-content");
      content.classList.remove("show");
      
      var categoryOptions = document.querySelectorAll(".category-content > div");
      categoryOptions.forEach(function(option) {
        option.classList.remove("show");
      };
      
      var selectedCategory = this.textContent.trim();
      var selectedCategoryOptions = document.querySelector(".category-content ." + selectedCategory.toLowerCase() + "-options");
      if (selectedCategoryOptions) {
        content.classList.add("show");
        selectedCategoryOptions.classList.add("show");
      }
    };
  };
};