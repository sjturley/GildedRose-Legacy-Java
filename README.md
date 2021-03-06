# Gilded Rose Legacy Kata
Gilded Rose Legacy Kata in Java.

1. Use the code in a test harness by creating an instance of the `GildedRose` class and calling the `updateQuality` method on that instance.
1. Deal with the irritating dependency by using either the "Wrap and Extend" or "Subclass to Test" technique.
1. Verify the result of GildedRose.items using Approvals.verify. Notice how the output isn't very useful? 
1. The default Java toString is not useful. Override the toString method in Item class and generate a toString implementation using your IDE. Output is still not useful. 
1. Change the Approvals.verify to call Arrays.toString() on GildedRose.items. This output is much better.
1. Examine the file generated by Approvals and rename the suffix from *.received.txt to *.approved.txt. Re-run the test to make sure it is now green.
1. Extract your test logic into a method that returns the result you are verifying.
1. Examine the method under test (`GildedRose::updateQuality`). What data does the method use? Extract that data as parameters to the method you created in the previous step. 
1. Convert your Approvals.verify test into a CombinationApprovals.verifyAllCombinations but start with only a single combination. Each parameter now becomes an array with a single value.
1. Run the test, inspect the output, and approve the result.
1. Run your test with code coverage and check for branches missing coverage. Add more combinations until all branches of the code are fully covered.
1. Test mutations by finding places in the production code to modify. Do your tests fail when you break the production code? If they do not fail, the tests are not yet sufficient.
1. Update tests to prevent mutation failures.