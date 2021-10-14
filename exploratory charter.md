**Test Plan Document**

**Exploratory testing charter ****:**

<table>
  <tr>
    <td>S.No</td>
    <td>Target</td>
    <td>Resources</td>
    <td>Information</td>
  </tr>
  <tr>
    <td>1</td>
    <td>Test to verify installation and uninstallation  of Monefy App</td>
    <td>IOS/ Android Mobile device</td>
    <td>User should be able to install and uninstall the app from playstore/Appstore respectively</td>
  </tr>
  <tr>
    <td>2</td>
    <td>Test to verify Home page </td>
    <td>Monefy app should be installed in the device</td>
    <td>User should have options to add income and expenses</td>
  </tr>
  <tr>
    <td>3</td>
    <td>Test to verify New income addition</td>
    <td>User should have the income details as well as the category under which the specific income falls
User should have the specific accounts(whether it is cash/Card etc)</td>
    <td>User should have the option to select Accounts (Cash/Card etc.) and the specified income with category 
The given income should get listed in the home page</td>
  </tr>
  <tr>
    <td>4</td>
    <td>Test to verify New expense addition</td>
    <td>User should have the expense details as well as the category under which the specific expense falls
User should have the specific accounts(whether it is cash/Card etc) through which expense is incurred</td>
    <td>User should have the option to select Accounts (Cash/Card etc.) and the specified expense with category 
The given expenseshould get listed in the home page
The expense percentage should be displayed on the specific category based on the total income</td>
  </tr>
  <tr>
    <td>5</td>
    <td>Test to verify expense details based on the filter (Day/ Week/ Month)</td>
    <td>User should have data for different months</td>
    <td>From the home page, based on the selected filter, results should be displayed to the user by considering the expense and income</td>
  </tr>
  <tr>
    <td>6</td>
    <td>Test to verify search functionality</td>
    <td>User should have entered data</td>
    <td>Based on the search criteria, corresponding search result should be displayed</td>
  </tr>
  <tr>
    <td>7</td>
    <td>Test to verify Transfer option</td>
    <td>User should open new transfer section from home page</td>
    <td>There should be provision for the user to transfer from selected source to chosen destination</td>
  </tr>
  <tr>
    <td>8</td>
    <td>Test to verify date selection</td>
    <td>User opted to specify income/expense</td>
    <td>There should be provision for the user to choose the date</td>
  </tr>
</table>


**Finding from the charter ****:**

* **Most of the functionalities worked as expected**

**Issues observed :**

* **After specifying the expense, the percentage of expense displayed in the home page for each category is wrong (It is not based on the total income)**

* **Both the icons on the left and right side of the Balance section serves the same purpose**

* **After navigating to any specific page/section, there is no option to navigate directly to the home page, user has to press back button everytime **

**Prioritisation of the charter:**

* **First priority should be to check the balance option as it is very vital from a customer point of view**

* **User should be able to add income and expenses and the specified amount should be listed correctly in the home page**

* **Correct data should be displayed to the user based on the filters applied**

**Time spend:**

* **Time spend will be based on the complexity of the charter and it differs based on the cases. Ideally it should take nearly 15 minutes**

**Risks:**

* **As the basic version does not support synchronization , if any issue occurs for the device/app, it would be difficult to retrieve the data**

* **No authentication/ security for the basic version and hence data breach could happen**

