package userRegistrationTest;

import org.testng.annotations.Test;

import baseComponent.BaseClass;
import commonPages.BackToPlans;
import commonPages.BodyTypeYouWant;
import commonPages.ChooseBodyType;
import commonPages.ChoosePlan;
import commonPages.ChooseYourTargetZones;
import commonPages.ConsiderYourPerfectWeight;
import commonPages.ContinuePage;
import commonPages.DiseaseClass;
import commonPages.EventDateSelection;
import commonPages.GenderSel;
import commonPages.GotIt;
import commonPages.HowActiveAreYou;
import commonPages.HowTallAreYou;
import commonPages.HowYouSpendYourDay;
import commonPages.PickYourDailyHabitsAndLifestylePreferences;
import commonPages.LastHappyWithYourWeight;
import commonPages.MealPreparationEachDay;
import commonPages.Meat;
import commonPages.OneAndOnlyPlan;
import commonPages.OtherFoodItems;
import commonPages.ShedSomeExtraWeight;
import commonPages.SpecialOccasions;
import commonPages.SummaryOfYourOverallWellness;
import commonPages.Veggies;
import commonPages.WantToAchieve;
import commonPages.WhatIsYourAge;
import commonPages.WhatIsYourCurrentWeight;
import commonPages.Your4WeekKetoDietingPlan;
import commonPages.YourKetoDietPlanIsReady;

public class UserReMenTest extends BaseClass {
	ChooseBodyType type;
	BodyTypeYouWant desiredBody;
	WantToAchieve achieve;
	ContinuePage conti;
	ChooseYourTargetZones zone;
	LastHappyWithYourWeight happy;
	MealPreparationEachDay mealpreparation;
	Meat meat;
	Veggies veggies;
	OtherFoodItems foodItems;
	HowActiveAreYou activeAre;
	HowYouSpendYourDay yourDay;
	PickYourDailyHabitsAndLifestylePreferences answers;
	ShedSomeExtraWeight extraWeight;
	DiseaseClass disease;
	HowTallAreYou tall;
	WhatIsYourCurrentWeight currentWt;
	ConsiderYourPerfectWeight targetWeight;
	WhatIsYourAge age;
	SummaryOfYourOverallWellness wellness;
	SpecialOccasions occasions;
	EventDateSelection date;
	OneAndOnlyPlan plan;
	Your4WeekKetoDietingPlan week;
	YourKetoDietPlanIsReady planReady;
	BackToPlans backPlans;
	GotIt gotit;
	ChoosePlan chooseplan;

	@Test(priority = 1,groups="functionality")
	public void userRegistrationMenNonVeg() throws Throwable {
		//gender = page.landingPage();
		type = gender.genderMen();
		desiredBody = type.choosebodyTypeAv();
		achieve = desiredBody.bodytypeYouWantBulk();
		conti = achieve.wantToAchieve();
		zone = conti.continuePage();
		happy = zone.yourTargetZone();
		mealpreparation = happy.lastHappyWithYourWeight();
		meat = mealpreparation.mealPreparationEachDay();
		veggies = meat.meat();
		foodItems = veggies.veggies();
		activeAre = foodItems.non_veg();
		yourDay = activeAre.almostNoPhysicalActivity();
		answers = yourDay.atWorkplace();
		answers.qualitySleep();
		answers.atNight();
		answers.saltIntakeIsMore();
		answers.quitEatingSweets();
		answers.softDrinks();
		extraWeight = answers.continueButton();
		disease = extraWeight.justWant();
		tall=disease.disease();
		currentWt = tall.heightCm();
		targetWeight = currentWt.weightKG();
		age = targetWeight.tarWeightKG();
		wellness = age.yourAge();
		occasions = wellness.overallWellness();
		date = occasions.vacation();
		plan = date.skipThisQuestion();
		week = plan.oneAndOnlyPlan();
		planReady = week.validEmail();
		backPlans = planReady.oneMonthPlan();
		gotit = backPlans.backToPlan();
		chooseplan = gotit.goIt();
		chooseplan.choosePlan();
	}

	@Test(priority = 2 ,groups="functionality")
	public void userRegistrationMenVeg() throws Throwable {
		//gender = page.landingPage();
		type = gender.genderMen();
		desiredBody = type.choosebodyTypeEx();
		achieve = desiredBody.bodytypeYouWantCut();
		conti = achieve.wantToAchieve();
		zone = conti.continuePage();
		happy = zone.yourTargetZone();
		mealpreparation = happy.lastHappyWithYourWeight();
		meat = mealpreparation.mealPreparationEachDay();
		veggies = meat.vegetarian();
		foodItems = veggies.veggies();
		activeAre = foodItems.veget();
		yourDay = activeAre.iOftenGoForWalk();
		answers = yourDay.iSpendPrettyMuchTimeOnFoot();
		answers.qualitySleep();
		answers.atNight();
		answers.saltIntakeIsMore();
		answers.softDrinks();
		extraWeight = answers.continueButton();
		disease = extraWeight.justWant();
		tall=disease.noDisease();
		currentWt = tall.heightCm();
		targetWeight = currentWt.weightKG();
		age = targetWeight.tarWeightKG();
		wellness = age.yourAge();
		occasions = wellness.overallWellness();
		date = occasions.wedding();
		plan = date.skipThisQuestion();
		week = plan.oneAndOnlyPlan();
		week = plan.oneAndOnlyPlan();
		planReady = week.validEmail();
		backPlans = planReady.oneMonthPlan();
		gotit = backPlans.backToPlan();
		chooseplan = gotit.goIt();
		chooseplan.choosePlan();
	}

	@Test(priority = 3 ,groups="functionality")
	public void userRegistrationMenVegan() throws Throwable {
		//gender = page.landingPage();
		type = gender.genderMen();
		desiredBody = type.choosebodyTypeAv();
		achieve = desiredBody.bodytypeYouWantFit();
		conti = achieve.wantToAchieve();
		zone = conti.continuePage();
		happy = zone.yourTargetZone();
		mealpreparation = happy.lastHappyWithYourWeight();
		meat = mealpreparation.mealPreparationEachDay();
		veggies = meat.vegan();
		foodItems = veggies.veggies();
		activeAre = foodItems.vega();
		yourDay = activeAre.iExerciseTimesWeek();
		answers = yourDay.atWorkplace();
		extraWeight = answers.noneOfTheAbove();
		disease = extraWeight.justWant();
		tall=disease.disease();
		currentWt = tall.heightCm();
		targetWeight = currentWt.weightKG();
		age = targetWeight.tarWeightKG();
		wellness = age.yourAge();
		occasions = wellness.overallWellness();
		date=occasions.sportingEvent();
		plan = date.skipThisQuestion();
		week = plan.oneAndOnlyPlan();
		week = plan.oneAndOnlyPlan();
		planReady = week.validEmail();
		backPlans = planReady.oneMonthPlan();
		gotit = backPlans.backToPlan();
		chooseplan = gotit.goIt();
		chooseplan.choosePlan();
	}

	@Test(priority = 4)
	public void heightInFtNonVeg() throws InterruptedException {
		//gender = page.landingPage();
		type = gender.genderMen();
		desiredBody = type.choosebodyTypeEx();
		achieve = desiredBody.bodytypeYouWantBulk();
		conti = achieve.wantToAchieve();
		zone = conti.continuePage();
		happy = zone.yourTargetZone();
		mealpreparation = happy.lastHappyWithYourWeight();
		meat = mealpreparation.mealPreparationEachDay();
		veggies = meat.meat();
		foodItems = veggies.veggies();
		activeAre = foodItems.non_veg();
		yourDay = activeAre.almostNoPhysicalActivity();
		answers = yourDay.atWorkplace();
		answers.qualitySleep();
		answers.atNight();
		answers.saltIntakeIsMore();
		answers.quitEatingSweets();
		answers.softDrinks();
		extraWeight = answers.continueButton();
		disease = extraWeight.justWant();
		tall=disease.noDisease();
		currentWt = tall.heightFeet();
		targetWeight = currentWt.weightKG();
		age = targetWeight.tarWeightKG();
		wellness = age.yourAge();
		occasions = wellness.overallWellness();
		date = occasions.sportingEvent();
		plan = date.dateSelection();
		week = plan.oneAndOnlyPlan();
		week = plan.oneAndOnlyPlan();
		planReady = week.validEmail();
		backPlans = planReady.oneMonthPlan();
		gotit = backPlans.backToPlan();
		chooseplan = gotit.goIt();
		chooseplan.choosePlan();

	}

	@Test(priority = 5)
	public void heightInFtVeget() throws InterruptedException {
		//gender = page.landingPage();
		type = gender.genderMen();
		desiredBody = type.choosebodyTypeAv();
		achieve = desiredBody.bodytypeYouWantCut();
		conti = achieve.wantToAchieve();
		zone = conti.continuePage();
		happy = zone.yourTargetZone();
		mealpreparation = happy.lastHappyWithYourWeight();
		meat = mealpreparation.mealPreparationEachDay();
		veggies = meat.vegetarian();
		foodItems = veggies.veggies();
		activeAre = foodItems.veget();
		yourDay = activeAre.iOftenGoForWalk();
		answers = yourDay.iSpendPrettyMuchTimeOnFoot();
		answers.qualitySleep();
		answers.atNight();
		answers.saltIntakeIsMore();
		answers.softDrinks();
		extraWeight = answers.continueButton();
		disease = extraWeight.justWant();
		tall=disease.noDisease();
		currentWt = tall.heightFeet();
		targetWeight = currentWt.weightKG();
		age = targetWeight.tarWeightKG();
		wellness = age.yourAge();
		occasions = wellness.overallWellness();
		date = occasions.Other();
		plan = date.skipThisQuestion();
		week = plan.oneAndOnlyPlan();
		week = plan.oneAndOnlyPlan();
		planReady = week.validEmail();
		backPlans = planReady.oneMonthPlan();
		gotit = backPlans.backToPlan();
		chooseplan = gotit.goIt();
		chooseplan.choosePlan();
	}

	@Test(priority = 6)
	public void heightInFeetvegan() throws InterruptedException {
		//gender = page.landingPage();
		type = gender.genderMen();
		desiredBody = type.choosebodyTypeEx();
		achieve = desiredBody.bodytypeYouWantFit();
		conti = achieve.wantToAchieve();
		zone = conti.continuePage();
		happy = zone.yourTargetZone();
		mealpreparation = happy.lastHappyWithYourWeight();
		meat = mealpreparation.mealPreparationEachDay();
		veggies = meat.vegan();
		foodItems = veggies.veggies();
		activeAre = foodItems.vega();
		yourDay = activeAre.iExerciseTimesWeek();
		answers = yourDay.atWorkplace();
		extraWeight = answers.noneOfTheAbove();
		disease = extraWeight.justWant();
		tall=disease.disease();
		currentWt = tall.heightFeet();
		targetWeight = currentWt.weightKG();
		age = targetWeight.tarWeightKG();
		wellness = age.yourAge();
		occasions = wellness.overallWellness();
		plan = occasions.No();
		week = plan.oneAndOnlyPlan();
		week = plan.oneAndOnlyPlan();
		planReady = week.validEmail();
		backPlans = planReady.oneMonthPlan();
		gotit = backPlans.backToPlan();
		chooseplan = gotit.goIt();
		chooseplan.choosePlan();

	}

	@Test(priority = 7)
	public void weightInLbsNonVeg() throws InterruptedException {
		//gender = page.landingPage();
		type = gender.genderMen();
		desiredBody = type.choosebodyTypeAv();
		achieve = desiredBody.bodytypeYouWantBulk();
		conti = achieve.wantToAchieve();
		zone = conti.continuePage();
		happy = zone.yourTargetZone();
		mealpreparation = happy.lastHappyWithYourWeight();
		meat = mealpreparation.mealPreparationEachDay();
		veggies = meat.meat();
		foodItems = veggies.veggies();
		activeAre = foodItems.non_veg();
		yourDay = activeAre.almostNoPhysicalActivity();
		answers = yourDay.atWorkplace();
		answers.qualitySleep();
		answers.atNight();
		answers.saltIntakeIsMore();
		answers.quitEatingSweets();
		answers.softDrinks();
		extraWeight = answers.continueButton();
		disease = extraWeight.justWant();
		tall=disease.noDisease();
		currentWt = tall.heightCm();
		targetWeight = currentWt.weightLbs();
		age = targetWeight.tarWeightLbs();
		wellness = age.yourAge();
		occasions = wellness.overallWellness();
		date = occasions.Other();
		plan = date.skipThisQuestion();
		week = plan.oneAndOnlyPlan();
		week = plan.oneAndOnlyPlan();
		planReady = week.validEmail();
		backPlans = planReady.oneMonthPlan();
		gotit = backPlans.backToPlan();
		chooseplan = gotit.goIt();
		chooseplan.choosePlan();
	}

	@Test(priority = 8)
	public void weightLbsVeget() throws InterruptedException {
		//gender = page.landingPage();
		type = gender.genderMen();
		desiredBody = type.choosebodyTypeEx();
		achieve = desiredBody.bodytypeYouWantCut();
		conti = achieve.wantToAchieve();
		zone = conti.continuePage();
		happy = zone.yourTargetZone();
		mealpreparation = happy.lastHappyWithYourWeight();
		meat = mealpreparation.mealPreparationEachDay();
		veggies = meat.vegetarian();
		foodItems = veggies.veggies();
		activeAre = foodItems.veget();
		yourDay = activeAre.iOftenGoForWalk();
		answers = yourDay.iSpendPrettyMuchTimeOnFoot();
		answers.qualitySleep();
		answers.atNight();
		answers.saltIntakeIsMore();
		answers.softDrinks();
		extraWeight = answers.continueButton();
		disease = extraWeight.justWant();
		tall=disease.disease();
		currentWt = tall.heightCm();
		targetWeight = currentWt.weightLbs();
		age = targetWeight.tarWeightLbs();
		wellness = age.yourAge();
		occasions = wellness.overallWellness();
		date = occasions.vacation();
		plan = date.dateSelection();
		week = plan.oneAndOnlyPlan();
		week = plan.oneAndOnlyPlan();
		planReady = week.validEmail();
		backPlans = planReady.sixMonthPlan();
		gotit = backPlans.backToPlan();
		chooseplan = gotit.goIt();
		chooseplan.choosePlan();

	}

	@Test(priority = 9)
	public void weightLbsVegan() throws InterruptedException {
		//gender = page.landingPage();
		type = gender.genderMen();
		desiredBody = type.choosebodyTypeAv();
		achieve = desiredBody.bodytypeYouWantFit();
		conti = achieve.wantToAchieve();
		zone = conti.continuePage();
		happy = zone.yourTargetZone();
		mealpreparation = happy.lastHappyWithYourWeight();
		meat = mealpreparation.mealPreparationEachDay();
		veggies = meat.vegan();
		foodItems = veggies.veggies();
		activeAre = foodItems.vega();
		yourDay = activeAre.iExerciseTimesWeek();
		answers = yourDay.atWorkplace();
		extraWeight = answers.noneOfTheAbove();
		disease = extraWeight.justWant();
		tall=disease.noDisease();
		currentWt = tall.heightCm();
		targetWeight = currentWt.weightLbs();
		age = targetWeight.tarWeightLbs();
		wellness = age.yourAge();
		occasions = wellness.overallWellness();
		date = occasions.vacation();
		plan = date.skipThisQuestion();
		week = plan.oneAndOnlyPlan();
		week = plan.oneAndOnlyPlan();
		planReady = week.validEmail();
		backPlans = planReady.sixMonthPlan();
		gotit = backPlans.backToPlan();
		chooseplan = gotit.goIt();
		chooseplan.choosePlan();
	}

	@Test(priority = 10)
	public void userWithBlankdEmaiIdMen() throws InterruptedException {
		//gender = page.landingPage();
		type = gender.genderMen();
		desiredBody = type.choosebodyTypeEx();
		achieve = desiredBody.bodytypeYouWantBulk();
		conti = achieve.wantToAchieve();
		zone = conti.continuePage();
		happy = zone.yourTargetZone();
		mealpreparation = happy.lastHappyWithYourWeight();
		meat = mealpreparation.mealPreparationEachDay();
		veggies = meat.meat();
		foodItems = veggies.veggies();
		activeAre = foodItems.non_veg();
		yourDay = activeAre.almostNoPhysicalActivity();
		answers = yourDay.atWorkplace();
		answers.qualitySleep();
		answers.atNight();
		answers.saltIntakeIsMore();
		answers.quitEatingSweets();
		answers.softDrinks();
		extraWeight = answers.continueButton();
		disease = extraWeight.justWant();
		tall=disease.disease();
		currentWt = tall.heightCm();
		targetWeight = currentWt.weightLbs();
		age = targetWeight.tarWeightLbs();
		wellness = age.yourAge();
		occasions = wellness.overallWellness();
		date = occasions.wedding();
		plan = date.skipThisQuestion();
		week = plan.oneAndOnlyPlan();
		week = plan.oneAndOnlyPlan();
		planReady = week.blankEmail();
		backPlans = planReady.threeMonthPlan();
		gotit = backPlans.backToPlan();
		chooseplan = gotit.goIt();
		chooseplan.choosePlan();
	}
	
	@Test(priority = 11)
	public void withoutFakeruserRegistrationMenNonVeg() throws Throwable {
		//gender = page.landingPage();
		type = gender.genderMen();
		desiredBody = type.choosebodyTypeAv();
		achieve = desiredBody.bodytypeYouWantCut();
		conti = achieve.wantToAchieve();
		zone = conti.continuePage();
		happy = zone.yourTargetZone();
		mealpreparation = happy.lastHappyWithYourWeight();
		meat = mealpreparation.mealPreparationEachDay();
		veggies = meat.meat();
		foodItems = veggies.veggies();
		activeAre = foodItems.non_veg();
		yourDay = activeAre.almostNoPhysicalActivity();
		answers = yourDay.atWorkplace();
		answers.qualitySleep();
		answers.atNight();
		answers.saltIntakeIsMore();
		answers.quitEatingSweets();
		answers.softDrinks();
		extraWeight = answers.continueButton();
		disease = extraWeight.justWant();
		tall=disease.noDisease();
		currentWt = tall.withoutFakerheightCm();
		targetWeight = currentWt.withoutFakerweightLbs();
		age = targetWeight.withoutFakertarWeightLbs();
		wellness = age.withoutFakeryourAge();
		occasions = wellness.overallWellness();
		date = occasions.vacation();
		plan = date.skipThisQuestion();
		week = plan.oneAndOnlyPlan();
		week = plan.oneAndOnlyPlan();
		planReady = week.validEmail();
		backPlans = planReady.sixMonthPlan();
		gotit = backPlans.backToPlan();
		chooseplan = gotit.goIt();
		chooseplan.choosePlan();
	}

	@Test(priority = 12)
	public void userRegistrationMenVegwitoutFaker() throws Throwable {
		//gender = page.landingPage();
		type = gender.genderMen();
		desiredBody = type.choosebodyTypeEx();
		achieve = desiredBody.bodytypeYouWantFit();
		conti = achieve.wantToAchieve();
		zone = conti.continuePage();
		happy = zone.yourTargetZone();
		mealpreparation = happy.lastHappyWithYourWeight();
		meat = mealpreparation.mealPreparationEachDay();
		veggies = meat.vegetarian();
		foodItems = veggies.veggies();
		activeAre = foodItems.veget();
		yourDay = activeAre.iOftenGoForWalk();
		answers = yourDay.iSpendPrettyMuchTimeOnFoot();
		answers.qualitySleep();
		answers.atNight();
		answers.saltIntakeIsMore();
		answers.softDrinks();
		extraWeight = answers.continueButton();
		disease = extraWeight.justWant();
		tall=disease.disease();
		currentWt = tall.withoutFakerheightCm();
		targetWeight = currentWt.withoutFakeeweightKG();
		age = targetWeight.withoutFakertarWeightKG();
		wellness = age.withoutFakeryourAge();
		occasions = wellness.overallWellness();
		date = occasions.wedding();
		plan = date.skipThisQuestion();
		week = plan.oneAndOnlyPlan();
		week = plan.oneAndOnlyPlan();
		planReady = week.validEmail();
		backPlans = planReady.sixMonthPlan();
		gotit = backPlans.backToPlan();
		chooseplan = gotit.goIt();
		chooseplan.choosePlan();
	}

	@Test(priority = 13)
	public void witoutFakeruserRegistrationMenVegan() throws Throwable {
		//gender = page.landingPage();
		type = gender.genderMen();
		desiredBody = type.choosebodyTypeAv();
		achieve = desiredBody.bodytypeYouWantBulk();
		conti = achieve.wantToAchieve();
		zone = conti.continuePage();
		happy = zone.yourTargetZone();
		mealpreparation = happy.lastHappyWithYourWeight();
		meat = mealpreparation.mealPreparationEachDay();
		veggies = meat.vegan();
		foodItems = veggies.veggies();
		activeAre = foodItems.vega();
		yourDay = activeAre.iExerciseTimesWeek();
		answers = yourDay.atWorkplace();
		extraWeight = answers.noneOfTheAbove();
		disease = extraWeight.justWant();
		tall=disease.noDisease();
		currentWt = tall.withoutFakerheightFeet();
		targetWeight = currentWt.withoutFakerweightLbs();
		age = targetWeight.tarWeightLbs();
		wellness = age.withoutFakeryourAge();
		occasions = wellness.overallWellness();
		date=occasions.sportingEvent();
		plan = date.skipThisQuestion();
		week = plan.oneAndOnlyPlan();
		week = plan.oneAndOnlyPlan();
		planReady = week.validEmail();
		backPlans = planReady.oneMonthPlan();
		gotit = backPlans.backToPlan();
		chooseplan = gotit.goIt();
		chooseplan.choosePlan();
	}
	@Test(priority=1301, groups="eatAll")
	public void userRegistrationMenNonVegEatAll() throws Throwable {
		//gender = page.landingPage();
		type = gender.genderMen();
		desiredBody = type.choosebodyTypeAv();
		achieve = desiredBody.bodytypeYouWantBulk();
		conti = achieve.wantToAchieve();
		zone = conti.continuePage();
		happy = zone.yourTargetZone();
		mealpreparation = happy.lastHappyWithYourWeight();
		meat = mealpreparation.mealPreparationEachDay();
		veggies = meat.eatAllMeat();
		foodItems = veggies.eatAllVeggies();
		activeAre = foodItems.eatAll();
		yourDay = activeAre.almostNoPhysicalActivity();
		answers = yourDay.atWorkplace();
		answers.qualitySleep();
		answers.atNight();
		answers.saltIntakeIsMore();
		answers.quitEatingSweets();
		answers.softDrinks();
		extraWeight = answers.continueButton();
		disease = extraWeight.justWant();
		tall=disease.disease();
		currentWt = tall.heightCm();
		targetWeight = currentWt.weightKG();
		age = targetWeight.tarWeightKG();
		wellness = age.yourAge();
		occasions = wellness.overallWellness();
		date = occasions.vacation();
		plan = date.skipThisQuestion();
		week = plan.oneAndOnlyPlan();
		planReady = week.validEmail();
		backPlans = planReady.oneMonthPlan();
		gotit = backPlans.backToPlan();
		chooseplan = gotit.goIt();
		chooseplan.choosePlan();
	}
	@Test(priority = 1302,groups="eatAll")
	public void userRegistrationMenVegEatAll() throws Throwable {
		//gender = page.landingPage();
		type = gender.genderMen();
		desiredBody = type.choosebodyTypeEx();
		achieve = desiredBody.bodytypeYouWantCut();
		conti = achieve.wantToAchieve();
		zone = conti.continuePage();
		happy = zone.yourTargetZone();
		mealpreparation = happy.lastHappyWithYourWeight();
		meat = mealpreparation.mealPreparationEachDay();
		veggies = meat.vegetarian();
		foodItems = veggies.eatAllVeggies();
		activeAre = foodItems.eatAll();
		yourDay = activeAre.iOftenGoForWalk();
		answers = yourDay.iSpendPrettyMuchTimeOnFoot();
		answers.qualitySleep();
		answers.atNight();
		answers.saltIntakeIsMore();
		answers.softDrinks();
		extraWeight = answers.continueButton();
		disease = extraWeight.justWant();
		tall=disease.noDisease();
		currentWt = tall.heightCm();
		targetWeight = currentWt.weightKG();
		age = targetWeight.tarWeightKG();
		wellness = age.yourAge();
		occasions = wellness.overallWellness();
		date = occasions.wedding();
		plan = date.skipThisQuestion();
		week = plan.oneAndOnlyPlan();
		week = plan.oneAndOnlyPlan();
		planReady = week.validEmail();
		backPlans = planReady.oneMonthPlan();
		gotit = backPlans.backToPlan();
		chooseplan = gotit.goIt();
		chooseplan.choosePlan();
	}

	@Test(priority = 1303,groups="eatAll")
	public void userRegistrationMenVeganEatAll() throws Throwable {
		//gender = page.landingPage();
		type = gender.genderMen();
		desiredBody = type.choosebodyTypeAv();
		achieve = desiredBody.bodytypeYouWantFit();
		conti = achieve.wantToAchieve();
		zone = conti.continuePage();
		happy = zone.yourTargetZone();
		mealpreparation = happy.lastHappyWithYourWeight();
		meat = mealpreparation.mealPreparationEachDay();
		veggies = meat.vegan();
		foodItems = veggies.eatAllVeggies();
		activeAre = foodItems.eatAll();
		yourDay = activeAre.iExerciseTimesWeek();
		answers = yourDay.atWorkplace();
		extraWeight = answers.noneOfTheAbove();
		disease = extraWeight.justWant();
		tall=disease.disease();
		currentWt = tall.heightCm();
		targetWeight = currentWt.weightKG();
		age = targetWeight.tarWeightKG();
		wellness = age.yourAge();
		occasions = wellness.overallWellness();
		date=occasions.sportingEvent();
		plan = date.skipThisQuestion();
		week = plan.oneAndOnlyPlan();
		week = plan.oneAndOnlyPlan();
		planReady = week.validEmail();
		backPlans = planReady.oneMonthPlan();
		gotit = backPlans.backToPlan();
		chooseplan = gotit.goIt();
		chooseplan.choosePlan();
	}
	@Test(groups="negative")
	public void userRegistrationMenNonVegNegHeightCmPRE() throws Throwable {
		//gender = page.landingPage();
		type = gender.genderMen();
		desiredBody = type.choosebodyTypeAv();
		achieve = desiredBody.bodytypeYouWantBulk();
		conti = achieve.wantToAchieve();
		zone = conti.continuePage();
		happy = zone.yourTargetZone();
		mealpreparation = happy.lastHappyWithYourWeight();
		meat = mealpreparation.mealPreparationEachDay();
		veggies = meat.meat();
		foodItems = veggies.veggies();
		activeAre = foodItems.non_veg();
		yourDay = activeAre.almostNoPhysicalActivity();
		answers = yourDay.atWorkplace();
		answers.qualitySleep();
		answers.atNight();
		answers.saltIntakeIsMore();
		answers.quitEatingSweets();
		answers.softDrinks();
		extraWeight = answers.continueButton();
		disease = extraWeight.justWant();
		tall=disease.disease();
		currentWt = tall.heightCmPreDef();
		targetWeight = currentWt.weightKG();
		age = targetWeight.tarWeightKG();
		wellness = age.yourAge();
		occasions = wellness.overallWellness();
		date = occasions.vacation();
		plan = date.skipThisQuestion();
		week = plan.oneAndOnlyPlan();
		planReady = week.validEmail();
		backPlans = planReady.oneMonthPlan();
		gotit = backPlans.backToPlan();
		chooseplan = gotit.goIt();
		chooseplan.choosePlan();
	}
	@Test(groups="negative")
	public void userRegistrationMenVegNegCm() throws Throwable {
		//gender = page.landingPage();
		type = gender.genderMen();
		desiredBody = type.choosebodyTypeEx();
		achieve = desiredBody.bodytypeYouWantCut();
		conti = achieve.wantToAchieve();
		zone = conti.continuePage();
		happy = zone.yourTargetZone();
		mealpreparation = happy.lastHappyWithYourWeight();
		meat = mealpreparation.mealPreparationEachDay();
		veggies = meat.vegetarian();
		foodItems = veggies.veggies();
		activeAre = foodItems.veget();
		yourDay = activeAre.iOftenGoForWalk();
		answers = yourDay.iSpendPrettyMuchTimeOnFoot();
		answers.qualitySleep();
		answers.atNight();
		answers.saltIntakeIsMore();
		answers.softDrinks();
		extraWeight = answers.continueButton();
		disease = extraWeight.justWant();
		tall=disease.noDisease();
		currentWt = tall.negheightCmPreDef();
		targetWeight = currentWt.weightKG();
		age = targetWeight.tarWeightKG();
		wellness = age.yourAge();
		occasions = wellness.overallWellness();
		date = occasions.wedding();
		plan = date.skipThisQuestion();
		week = plan.oneAndOnlyPlan();
		week = plan.oneAndOnlyPlan();
		planReady = week.validEmail();
		backPlans = planReady.oneMonthPlan();
		gotit = backPlans.backToPlan();
		chooseplan = gotit.goIt();
		chooseplan.choosePlan();
	}
	@Test(groups="negative")
	public void userRegistrationMenVeganNegFt() throws Throwable {
		//gender = page.landingPage();
		type = gender.genderMen();
		desiredBody = type.choosebodyTypeAv();
		achieve = desiredBody.bodytypeYouWantFit();
		conti = achieve.wantToAchieve();
		zone = conti.continuePage();
		happy = zone.yourTargetZone();
		mealpreparation = happy.lastHappyWithYourWeight();
		meat = mealpreparation.mealPreparationEachDay();
		veggies = meat.vegan();
		foodItems = veggies.veggies();
		activeAre = foodItems.vega();
		yourDay = activeAre.iExerciseTimesWeek();
		answers = yourDay.atWorkplace();
		extraWeight = answers.noneOfTheAbove();
		disease = extraWeight.justWant();
		tall=disease.disease();
		currentWt = tall.negativeHeightTesFt();
		targetWeight = currentWt.weightKG();
		age = targetWeight.tarWeightKG();
		wellness = age.yourAge();
		occasions = wellness.overallWellness();
		date=occasions.sportingEvent();
		plan = date.skipThisQuestion();
		week = plan.oneAndOnlyPlan();
		week = plan.oneAndOnlyPlan();
		planReady = week.validEmail();
		backPlans = planReady.oneMonthPlan();
		gotit = backPlans.backToPlan();
		chooseplan = gotit.goIt();
		chooseplan.choosePlan();
	}
	@Test(groups="negative")
	public void userRegistrationMenVegEatAllNegativeWeightLb() throws Throwable {
		//gender = page.landingPage();
		type = gender.genderMen();
		desiredBody = type.choosebodyTypeEx();
		achieve = desiredBody.bodytypeYouWantCut();
		conti = achieve.wantToAchieve();
		zone = conti.continuePage();
		happy = zone.yourTargetZone();
		mealpreparation = happy.lastHappyWithYourWeight();
		meat = mealpreparation.mealPreparationEachDay();
		veggies = meat.vegetarian();
		foodItems = veggies.eatAllVeggies();
		activeAre = foodItems.eatAll();
		yourDay = activeAre.iOftenGoForWalk();
		answers = yourDay.iSpendPrettyMuchTimeOnFoot();
		answers.qualitySleep();
		answers.atNight();
		answers.saltIntakeIsMore();
		answers.softDrinks();
		extraWeight = answers.continueButton();
		disease = extraWeight.justWant();
		tall=disease.noDisease();
		currentWt = tall.heightCm();
		targetWeight = currentWt.NegativeTestweightLbs();
		age = targetWeight.negativePerfectWeightLbs();
		wellness = age.yourAge();
		occasions = wellness.overallWellness();
		date = occasions.wedding();
		plan = date.skipThisQuestion();
		week = plan.oneAndOnlyPlan();
		week = plan.oneAndOnlyPlan();
		planReady = week.validEmail();
		backPlans = planReady.oneMonthPlan();
		gotit = backPlans.backToPlan();
		chooseplan = gotit.goIt();
		chooseplan.choosePlan();
	}
	@Test(groups="negative")
	public void registrationMenNonVegNegativeWeightKg() throws Throwable {
		//gender = page.landingPage();
		type = gender.genderMen();
		desiredBody = type.choosebodyTypeAv();
		achieve = desiredBody.bodytypeYouWantCut();
		conti = achieve.wantToAchieve();
		zone = conti.continuePage();
		happy = zone.yourTargetZone();
		mealpreparation = happy.lastHappyWithYourWeight();
		meat = mealpreparation.mealPreparationEachDay();
		veggies = meat.meat();
		foodItems = veggies.veggies();
		activeAre = foodItems.non_veg();
		yourDay = activeAre.almostNoPhysicalActivity();
		answers = yourDay.atWorkplace();
		answers.qualitySleep();
		answers.atNight();
		answers.saltIntakeIsMore();
		answers.quitEatingSweets();
		answers.softDrinks();
		extraWeight = answers.continueButton();
		disease = extraWeight.justWant();
		tall=disease.noDisease();
		currentWt = tall.withoutFakerheightCm();
		targetWeight = currentWt.negativeValueweightKG();
		age = targetWeight.negativePerfectWeightKG();
		wellness = age.withoutFakeryourAge();
		occasions = wellness.overallWellness();
		date = occasions.vacation();
		plan = date.skipThisQuestion();
		week = plan.oneAndOnlyPlan();
		week = plan.oneAndOnlyPlan();
		planReady = week.validEmail();
		backPlans = planReady.sixMonthPlan();
		gotit = backPlans.backToPlan();
		chooseplan = gotit.goIt();
		chooseplan.choosePlan();
	}
	@Test(groups = "negative")
	public void InvalidWeihgtKgvegan() throws InterruptedException {
		//gender = page.landingPage();
		type = gender.genderMen();
		desiredBody = type.choosebodyTypeEx();
		achieve = desiredBody.bodytypeYouWantFit();
		conti = achieve.wantToAchieve();
		zone = conti.continuePage();
		happy = zone.yourTargetZone();
		mealpreparation = happy.lastHappyWithYourWeight();
		meat = mealpreparation.mealPreparationEachDay();
		veggies = meat.vegan();
		foodItems = veggies.veggies();
		activeAre = foodItems.vega();
		yourDay = activeAre.iExerciseTimesWeek();
		answers = yourDay.atWorkplace();
		extraWeight = answers.noneOfTheAbove();
		disease = extraWeight.justWant();
		tall=disease.disease();
		currentWt = tall.heightFeet();
		targetWeight = currentWt.invalidCurrrWeightKG();
		age = targetWeight.invalidPerfectWeightKG();
		wellness = age.yourAge();
		occasions = wellness.overallWellness();
		plan = occasions.No();
		week = plan.oneAndOnlyPlan();
		week = plan.oneAndOnlyPlan();
		planReady = week.validEmail();
		backPlans = planReady.oneMonthPlan();
		gotit = backPlans.backToPlan();
		chooseplan = gotit.goIt();
		chooseplan.choosePlan();

	}
	@Test(groups="negative")
	public void invalidWeightLbVegEatAll() throws Throwable {
		//gender = page.landingPage();
		type = gender.genderMen();
		desiredBody = type.choosebodyTypeAv();
		achieve = desiredBody.bodytypeYouWantBulk();
		conti = achieve.wantToAchieve();
		zone = conti.continuePage();
		happy = zone.yourTargetZone();
		mealpreparation = happy.lastHappyWithYourWeight();
		meat = mealpreparation.mealPreparationEachDay();
		veggies = meat.eatAllMeat();
		foodItems = veggies.eatAllVeggies();
		activeAre = foodItems.eatAll();
		yourDay = activeAre.almostNoPhysicalActivity();
		answers = yourDay.atWorkplace();
		answers.qualitySleep();
		answers.atNight();
		answers.saltIntakeIsMore();
		answers.quitEatingSweets();
		answers.softDrinks();
		extraWeight = answers.continueButton();
		disease = extraWeight.justWant();
		tall=disease.disease();
		currentWt = tall.heightCm();
		targetWeight = currentWt.invalidCurrweightLbs();
		age = targetWeight.invalidPerfectWeightLbs();
		wellness = age.yourAge();
		occasions = wellness.overallWellness();
		date = occasions.vacation();
		plan = date.skipThisQuestion();
		week = plan.oneAndOnlyPlan();
		planReady = week.validEmail();
		backPlans = planReady.oneMonthPlan();
		gotit = backPlans.backToPlan();
		chooseplan = gotit.goIt();
		chooseplan.choosePlan();
	}


}