package MediaBrowser.Model.Dlna;

import MediaBrowser.Model.Extensions.*;
import MediaBrowser.Model.MediaInfo.*;

public class ConditionProcessor
{
	public final boolean IsVideoConditionSatisfied(ProfileCondition condition, Integer audioBitrate, Integer audioChannels, Integer width, Integer height, Integer bitDepth, Integer videoBitrate, String videoProfile, Double videoLevel, Float videoFramerate, Integer packetLength, TransportStreamTimestamp timestamp, Boolean isAnamorphic)
	{
		switch (condition.getProperty())
		{
			case AudioProfile:
				// TODO: Implement
				return true;
			case Has64BitOffsets:
				// TODO: Implement
				return true;
			case IsAnamorphic:
				return IsConditionSatisfied(condition, isAnamorphic);
			case VideoFramerate:
				return IsConditionSatisfied(condition, videoFramerate);
			case VideoLevel:
				return IsConditionSatisfied(condition, videoLevel);
			case VideoProfile:
				return IsConditionSatisfied(condition, videoProfile);
			case PacketLength:
				return IsConditionSatisfied(condition, packetLength);
			case AudioBitrate:
				return IsConditionSatisfied(condition, audioBitrate);
			case AudioChannels:
				return IsConditionSatisfied(condition, audioChannels);
			case VideoBitDepth:
				return IsConditionSatisfied(condition, bitDepth);
			case VideoBitrate:
				return IsConditionSatisfied(condition, videoBitrate);
			case Height:
				return IsConditionSatisfied(condition, height);
			case Width:
				return IsConditionSatisfied(condition, width);
			case VideoTimestamp:
				return IsConditionSatisfied(condition, timestamp);
			default:
				throw new IllegalArgumentException("Unexpected condition on video file: " + condition.getProperty());
		}
	}

	public final boolean IsImageConditionSatisfied(ProfileCondition condition, Integer width, Integer height)
	{
		switch (condition.getProperty())
		{
			case Height:
				return IsConditionSatisfied(condition, height);
			case Width:
				return IsConditionSatisfied(condition, width);
			default:
				throw new IllegalArgumentException("Unexpected condition on image file: " + condition.getProperty());
		}
	}

	public final boolean IsAudioConditionSatisfied(ProfileCondition condition, Integer audioChannels, Integer audioBitrate)
	{
		switch (condition.getProperty())
		{
			case AudioBitrate:
				return IsConditionSatisfied(condition, audioBitrate);
			case AudioChannels:
				return IsConditionSatisfied(condition, audioChannels);
			default:
				throw new IllegalArgumentException("Unexpected condition on audio file: " + condition.getProperty());
		}
	}

	public final boolean IsVideoAudioConditionSatisfied(ProfileCondition condition, Integer audioChannels, Integer audioBitrate, String audioProfile)
	{
		switch (condition.getProperty())
		{
			case AudioProfile:
				return IsConditionSatisfied(condition, audioProfile);
			case AudioBitrate:
				return IsConditionSatisfied(condition, audioBitrate);
			case AudioChannels:
				return IsConditionSatisfied(condition, audioChannels);
			default:
				throw new IllegalArgumentException("Unexpected condition on audio file: " + condition.getProperty());
		}
	}

	private boolean IsConditionSatisfied(ProfileCondition condition, Integer currentValue)
	{
		if (currentValue == null)
		{
			// If the value is unknown, it satisfies if not marked as required
			return !condition.getIsRequired();
		}

		int expected = 0;
		tangible.RefObject<Integer> tempRef_expected = new tangible.RefObject<Integer>(expected);
		boolean tempVar = IntHelper.TryParseCultureInvariant(condition.getValue(), tempRef_expected);
			expected = tempRef_expected.argValue;
		if (tempVar)
		{
			switch (condition.getCondition())
			{
				case Equals:
					return currentValue.equals(expected);
				case GreaterThanEqual:
					return currentValue >= expected;
				case LessThanEqual:
					return currentValue <= expected;
				case NotEquals:
					return !currentValue.equals(expected);
				default:
					throw new UnsupportedOperationException("Unexpected ProfileConditionType");
			}
		}

		return false;
	}

	private boolean IsConditionSatisfied(ProfileCondition condition, String currentValue)
	{
		if (tangible.DotNetToJavaStringHelper.isNullOrEmpty(currentValue))
		{
			// If the value is unknown, it satisfies if not marked as required
			return !condition.getIsRequired();
		}

		String expected = condition.getValue();

		switch (condition.getCondition())
		{
			case Equals:
				return StringHelper.EqualsIgnoreCase(currentValue, expected);
			case NotEquals:
				return !StringHelper.EqualsIgnoreCase(currentValue, expected);
			default:
				throw new UnsupportedOperationException("Unexpected ProfileConditionType");
		}
	}

	private boolean IsConditionSatisfied(ProfileCondition condition, Boolean currentValue)
	{
		if (currentValue == null)
		{
			// If the value is unknown, it satisfies if not marked as required
			return !condition.getIsRequired();
		}

		boolean expected = false;
		tangible.RefObject<Boolean> tempRef_expected = new tangible.RefObject<Boolean>(expected);
		boolean tempVar = BoolHelper.TryParseCultureInvariant(condition.getValue(), tempRef_expected);
			expected = tempRef_expected.argValue;
		if (tempVar)
		{
			switch (condition.getCondition())
			{
				case Equals:
					return currentValue == expected;
				case NotEquals:
					return currentValue != expected;
				default:
					throw new UnsupportedOperationException("Unexpected ProfileConditionType");
			}
		}

		return false;
	}

	private boolean IsConditionSatisfied(ProfileCondition condition, Float currentValue)
	{
		if (currentValue == null)
		{
			// If the value is unknown, it satisfies if not marked as required
			return !condition.getIsRequired();
		}

		float expected = 0F;
		tangible.RefObject<Float> tempRef_expected = new tangible.RefObject<Float>(expected);
		boolean tempVar = FloatHelper.TryParseCultureInvariant(condition.getValue(), tempRef_expected);
			expected = tempRef_expected.argValue;
		if (tempVar)
		{
			switch (condition.getCondition())
			{
				case Equals:
					return currentValue.equals(expected);
				case GreaterThanEqual:
					return currentValue >= expected;
				case LessThanEqual:
					return currentValue <= expected;
				case NotEquals:
					return !currentValue.equals(expected);
				default:
					throw new UnsupportedOperationException("Unexpected ProfileConditionType");
			}
		}

		return false;
	}

	private boolean IsConditionSatisfied(ProfileCondition condition, Double currentValue)
	{
		if (currentValue == null)
		{
			// If the value is unknown, it satisfies if not marked as required
			return !condition.getIsRequired();
		}

		double expected = 0;
		tangible.RefObject<Double> tempRef_expected = new tangible.RefObject<Double>(expected);
		boolean tempVar = DoubleHelper.TryParseCultureInvariant(condition.getValue(), tempRef_expected);
			expected = tempRef_expected.argValue;
		if (tempVar)
		{
			switch (condition.getCondition())
			{
				case Equals:
					return currentValue.equals(expected);
				case GreaterThanEqual:
					return currentValue >= expected;
				case LessThanEqual:
					return currentValue <= expected;
				case NotEquals:
					return !currentValue.equals(expected);
				default:
					throw new UnsupportedOperationException("Unexpected ProfileConditionType");
			}
		}

		return false;
	}

	private boolean IsConditionSatisfied(ProfileCondition condition, TransportStreamTimestamp timestamp)
	{
		if (timestamp == null)
		{
			// If the value is unknown, it satisfies if not marked as required
			return !condition.getIsRequired();
		}

//C# TO JAVA CONVERTER WARNING: Java does not have an 'ignoreCase' parameter for the static 'valueOf' method of enum types:
//ORIGINAL LINE: TransportStreamTimestamp expected = (TransportStreamTimestamp)Enum.Parse(typeof(TransportStreamTimestamp), condition.Value, true);
		TransportStreamTimestamp expected = TransportStreamTimestamp.valueOf(condition.getValue());

		switch (condition.getCondition())
		{
			case Equals:
				return timestamp == expected;
			case NotEquals:
				return timestamp != expected;
			default:
				throw new UnsupportedOperationException("Unexpected ProfileConditionType");
		}
	}
}