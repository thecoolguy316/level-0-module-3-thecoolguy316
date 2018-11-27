import javax.swing.JOptionPane;

public class HoroScope {
public static void main(String[] args) {
String question = JOptionPane.showInputDialog(null, "What is your Zodiac Sign?");

if (question.equalsIgnoreCase("scorpio")) {
	JOptionPane.showMessageDialog(null, "Upside: Scorpio exhibit\n extreme self-control in many areas,\n and as a result expect that of those around them.\n They are disciplined, protective and are very interested in others.\n They give of themselves but do expect the same in return.\n Scorpio males and females both need to be the leaders, \nand excel at problem solving \nand troubleshooting projects and situations.\r\n" + 
			"\r\n" + 
			"Downside: Scorpio invented the term ‘vendetta’.\n Once a Scorpio is crossed, they don’t forget it. \nFemale Scorpio are worse about this than they \nothers, often going decades without making\n amends with friends and family. Scorpio also \ntend to be pessimistic, often seeing threats where \nthere aren’t any, which can make them suspicious\n, stubborn and paranoid without cause.");
}	else if (question.equalsIgnoreCase("cancer")) {
	JOptionPane.showMessageDialog(null, "Upside: Cancer have an offbeat sense of humor\n, often finding something humorous that others don’t.\n They are extremely good listeners and have a heart for the problems of others.\n In fact, many gravitate toward this sign because they intuitively know that a Cancer will understand.\n When a Cancer becomes your friend you can be sure that they are truly your friend and will not consider using someone to their own benefit.\n Cancer tend to be dependable and reliable.\n They will tell you anything you want to know about them without blinking an eye as they are drawn to honesty in others as well as themselves.\n\r\n" + 
				"\r\n" + 
				"Downside: This sign can be moody, clingy, and often become incredibly insecure if they feel that they are about to lose the friendship or love of someone close to them.\n If the situation calls for it, they will lie, but often this dishonesty stems\n from a deep insecurity about being alone.");
}	else if (question.equalsIgnoreCase("aries")) {
	JOptionPane.showMessageDialog(null, "Upside: Highly energetic, and has no problem working\n long hours on a single project. Often take the initiative experiencing\n new breakthroughs and discoveries. Aries are thorough, painstaking, and have\n a knack for precise records and clarity. They live hard, love hard, and play hard.\r\n" + 
			"\r\n" + 
			"Downside: Aries have tunnel vision when working on\n a project which can make them seem selfish. They\n can become impatient with those who are not similar to themselves temperamentally\n and intellectually. The dedication to a project can become stubbornness, possessiveness,\n and can lead to a withdrawn and sullen attitude. Many Aries who do not feel\n acknowledged for their accomplishments become sarcastic and rude.");
}	else if (question.equalsIgnoreCase("leo")) {
JOptionPane.showMessageDialog(null, "Upside: Leo tend to be honest and decent people, opting to do the\n right thing regardless of the situation. They love organization so that they\n can find their ‘things’. Leos love material goods and luxury and want those that\n they love to experience this wealth as well. Leo are generally\n accepting of everyone initially and make decent, lasting relationships.\r\n" + 
		"\r\n" + 
		"Downside: Leo have a great sense of\n self-worth which can cross the line into arrogance.\n Leo can tend toward extravagance if they are not satisfied with what they\n have. Because they like to be in charge, they can\n often become smothering to their mates and friends,\n which may leave them alone (which Leo hates). Divorce and loss\n are devastating to this sign as they are all about the community and family.");
}	else if (question.equalsIgnoreCase("Virgo")) {
	JOptionPane.showMessageDialog(null, "Upside: Virgo have a heart for their fellow man. They are kind,\n patient and love to laugh. They are not loud ‘look at me’ signs, but rather prefer\n to be the strong, silent type. They are creative thinkers and true family oriented people.\n Male Virgo, once they are committed to relationship never walk away\n (unless there is a betrayal, and even then it isn’t written in stone). Female\n Virgo are dedicated parents, often parenting other children in the neighborhood.\r\n" + 
			"\r\n" + 
			"Downside: Virgo are particularly attentive to health; theirs,\n yours, everyone’s, which can often lead to obsessive behaviors toward health\n (hypochondria). They can also be judgmental and critical of those that\n they feel are not living up to their potential, or are going about a\n project in an inefficient way. Virgo are opinionated\n and have no problem sharing their opinions, even when they should not");
}	else if (question.equalsIgnoreCase("capricorn")) {
	JOptionPane.showMessageDialog(null, "Upside: Capricorns are the superheroes when It comes to making realistic, logical decisions. Their ability to cut through the red tape and see the bottom line is what makes them a real asset to any relationship or occupation where teamwork is valued. Capricorn are family oriented, but will keep their distance if the family is perceived to be violent, harmful, or unfulfilling. Capricorn have a dry sense of humor and their sarcastic wit is only appreciated by those who find humor everywhere. Highly intellectual, good with numbers and analysis, this sign is not often loud, but they are most definitely the muscle and the power behind the very successful machine.\r\n" + 
			"\r\n" + 
			"Downside: Because they are so dedicated to the big picture and the minute details, they can seem dull to others, who don’t understand the active internal nature of the Capricorn. While seeming almost emotionless on the surface, the Capricorn’s mind is always running on overdrive. They can often seem selfish and stingy, keeping information to themselves, or strategically withholding information for their own gain. Often they can be the less imaginative of the signs and refuse to face the facts about a situation because it\n would signal that they were wrong about something (which they hate).");
}
}
}
	



