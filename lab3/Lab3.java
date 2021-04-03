import java.util.Comparator;
import java.util.ArrayList;
public class Lab3 {
    public static void main(String[] args) {
		String s = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin in feugiat eros. Proin at nulla id lorem condimentum faucibus ac eget quam. Fusce urna nulla, ultrices a auctor ut, luctus non mi. Vestibulum vitae commodo leo, eget maximus justo. Vestibulum hendrerit varius metus, eget convallis dolor hendrerit at. Nulla quis tellus tristique, euismod augue eget, porttitor arcu. Proin sollicitudin sit amet odio eget sodales. Aenean aliquet felis velit, eget volutpat urna rutrum ut. In hac habitasse platea dictumst. Cras sodales nunc non diam consequat vestibulum. Maecenas ut tellus non nulla lacinia malesuada.Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Sed massa diam, suscipit a tempor sit amet, vestibulum eu mauris. Sed turpis nunc, lobortis non urna in, mollis porta enim. Morbi maximus eu purus quis molestie. Phasellus non fringilla velit. Nulla blandit dignissim massa, et ultrices neque lacinia sit amet. Nam iaculis laoreet lectus. Fusce et dui ac leo efficitur porttitor ut id sapien. Cras eget enim ac neque tincidunt dictum quis sed diam. Vivamus imperdiet molestie orci elementum commodo. Proin vel ante vulputate, efficitur ipsum sit amet, commodo felis. Nulla at lectus purus.Suspendisse vel arcu et lorem volutpat tristique eu sed erat. Nullam quis elit justo. Etiam commodo ipsum neque, id commodo enim volutpat quis. Quisque lacinia ac dolor sed commodo. Sed in ante non purus iaculis fringilla nec eget purus. Cras a semper mi. Curabitur at nulla urna. Nam aliquet eu tortor non molestie. Vivamus vitae feugiat nisl. Integer tincidunt lorem non ante tincidunt sodales.Etiam ultrices vestibulum nisl, a malesuada risus accumsan sit amet. Quisque sit amet arcu interdum, posuere leo ac, faucibus mi. Praesent felis lectus, luctus eu dui in, facilisis molestie lacus. Vivamus nec lacinia eros. Vestibulum lobortis, erat nec placerat auctor, leo quam laoreet quam, tempor tincidunt augue orci eu turpis. Sed tincidunt at erat a efficitur. Vestibulum lectus ex, ullamcorper quis sollicitudin non, luctus id odio. Donec vel pretium nibh, nec tempus arcu. Integer vitae bibendum arcu. Donec accumsan mollis malesuada. Duis nibh neque, laoreet vel fringilla quis, eleifend sed dolor. Proin ut pretium tellus.Praesent nibh velit, viverra sed consequat vitae, pretium nec diam. Nulla gravida luctus nibh, euismod suscipit ex aliquam ac. Donec lorem risus, vestibulum efficitur dapibus sit amet, finibus vitae libero. Maecenas velit ex, ultrices nec ex a, feugiat pulvinar urna. Integer in accumsan nibh, in scelerisque enim. Proin porta tellus sit amet nisi accumsan ullamcorper a ut magna. Proin dapibus nisi at orci gravida feugiat. Morbi feugiat aliquam tincidunt. Donec convallis leo ipsum, quis vulputate leo finibus a.";
		
		String[] sentences = s.split("\\.");
		int len = sentences.length;

		ArrayList<String[]> sentences_in_words = new ArrayList<>();
		
		for(int i = 0; i < len; i++){
			sentences[i] = sentences[i].strip();
			sentences_in_words.add(sentences[i].split(" "));
		}

		sentences_in_words.sort(Comparator.comparing(a -> a.length));

		for (String[] sentence : sentences_in_words){
			for (String word: sentence){
				System.out.print(word +" ");
			}
			System.out.println("\b.");
		}
	}
}
