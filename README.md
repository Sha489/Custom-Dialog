# Custom-Dialog

Hello, 

Create your own Custom Dialog.

/
## Declaration:-

CustomDialog customDialog;

/

## Custom Dialog with Image.

  customDialog = new CustomDialog(MainActivity.this, false); //false to show image
  
  customDialog.setHeading("Congratulations");
  
  customDialog.setDescription("You subscription is successfully.. You can continue to enjoy by watching videos");
  
  customDialog.setImageUrl("https://i.pinimg.com/originals/67/ac/a8/67aca82baa85cdbc23f501aa921f362a.png");
  
  customDialog.createDialog();

/

## Custom Dialog with animation.

  customDialog = new CustomDialog(MainActivity.this, true); //true refer to show animation
  
  customDialog.setHeading("Congratulations");
  
  customDialog.setDescription("You subscription is successfully.. You can continue to enjoy by watching videos");
  
  customDialog.setLottieAnimation("https://assets7.lottiefiles.com/packages/lf20_fpxnx6ry.json");
  
  customDialog.createDialog();
  

/
## Dependencies

allprojects {

		repositories {
		
			...
			maven { url 'https://jitpack.io' }
			
		}
		
	}
  
  
  dependencies {
  
	        implementation 'com.github.Sha489:Custom-Dialog:1.0'
		
	}
  
  
