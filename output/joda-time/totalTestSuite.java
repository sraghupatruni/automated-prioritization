import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
@RunWith(Suite.class)
@SuiteClasses({
org.joda.time.format.TestISODateTimeFormatParsing.class,
org.joda.time.chrono.TestGJDate.class,
org.joda.time.TestLocalTime_Constructors.class,
org.joda.time.chrono.TestLenientChronology.class,
org.joda.time.TestSerialization.class,
org.joda.time.field.TestScaledDurationField.class,
org.joda.time.chrono.gj.MainTest.class,
org.joda.time.TestDateTime_Basics.class,
org.joda.time.field.TestUnsupportedDateTimeField.class,
org.joda.time.TestWeeks.class,
org.joda.time.format.TestDateTimeFormatter.class,
org.joda.time.TestMutableDateTime_Constructors.class,
org.joda.time.TestMutableInterval_Basics.class,
org.joda.time.TestDateMidnight_Basics.class,
org.joda.time.TestMutablePeriod_Updates.class,
org.joda.time.TestSeconds.class,
org.joda.time.TestYearMonth_Constructors.class,
org.joda.time.chrono.TestISOChronology.class,
org.joda.time.TestPeriod_Basics.class,
org.joda.time.convert.TestReadablePeriodConverter.class,
org.joda.time.chrono.TestEthiopicChronology.class,
org.joda.time.chrono.TestGregorianChronology.class,
org.joda.time.TestLocalDate_Constructors.class,
org.joda.time.TestDateTimeConstants.class,
org.joda.time.TestDays.class,
org.joda.time.TestTimeOfDay_Basics.class,
org.joda.time.tz.TestCachedDateTimeZone.class,
org.joda.time.TestMutableInterval_Constructors.class,
org.joda.time.format.TestPeriodFormatterBuilder.class,
org.joda.time.TestMonths.class,
org.joda.time.TestLocalDateTime_Properties.class,
org.joda.time.convert.TestReadableIntervalConverter.class,
org.joda.time.TestYearMonth_Properties.class,
org.joda.time.TestStringConvert.class,
org.joda.time.TestDateMidnight_Constructors.class,
org.joda.time.TestInstant_Constructors.class,
org.joda.time.format.TestTextFields.class,
org.joda.time.TestLocalTime_Properties.class,
org.joda.time.convert.TestReadableDurationConverter.class,
org.joda.time.TestMutableDateTime_Adds.class,
org.joda.time.field.TestOffsetDateTimeField.class,
org.joda.time.convert.TestDateConverter.class,
org.joda.time.TestDurationField.class,
org.joda.time.format.TestPeriodFormatter.class,
org.joda.time.TestDurationFieldType.class,
org.joda.time.convert.TestConverterSet.class,
org.joda.time.TestDateTime_Constructors.class,
org.joda.time.TestChronology.class,
org.joda.time.tz.TestCompiler.class,
org.joda.time.field.TestPreciseDurationDateTimeField.class,
org.joda.time.TestBaseSingleFieldPeriod.class,
org.joda.time.TestLocalTime_Basics.class,
org.joda.time.TestMutablePeriod_Constructors.class,
junit.framework.TestSuite$1.class,
org.joda.time.convert.TestNullConverter.class,
org.joda.time.TestInterval_Basics.class,
org.joda.time.TestYearMonthDay_Properties.class,
org.joda.time.TestMutableDateTime_Sets.class,
org.joda.time.tz.TestBuilder.class,
org.joda.time.convert.TestStringConverter.class,
org.joda.time.TestDateTimeFieldType.class,
org.joda.time.TestIllegalFieldValueException.class,
org.joda.time.field.TestPreciseDurationField.class,
org.joda.time.format.TestISODateTimeFormat_Fields.class,
org.joda.time.format.TestISODateTimeFormat.class,
org.joda.time.TestMinutes.class,
org.joda.time.TestYearMonth_Basics.class,
org.joda.time.TestInstant_Basics.class,
org.joda.time.format.TestPeriodFormat.class,
org.joda.time.field.TestPreciseDateTimeField.class,
org.joda.time.TestPartial_Constructors.class,
org.joda.time.TestDuration_Basics.class,
org.joda.time.TestMonthDay_Constructors.class,
org.joda.time.TestLocalDateTime_Constructors.class,
org.joda.time.format.TestDateTimeFormatterBuilder.class,
org.joda.time.chrono.TestGJChronology.class,
org.joda.time.convert.TestLongConverter.class,
org.joda.time.TestDateTimeComparator.class,
org.joda.time.format.TestDateTimeParserBucket.class,
org.joda.time.field.TestBaseDateTimeField.class,
org.joda.time.TestLocalDate_Basics.class,
org.joda.time.field.TestMillisDurationField.class,
org.joda.time.format.TestDateTimeFormatStyle.class,
org.joda.time.TestPeriodType.class,
org.joda.time.TestTimeOfDay_Properties.class,
org.joda.time.convert.TestConverterManager.class,
org.joda.time.TestMutableDateTime_Properties.class,
org.joda.time.format.TestDateTimeFormat.class,
org.joda.time.format.TestPeriodFormatParsing.class,
org.joda.time.TestMutablePeriod_Basics.class,
org.joda.time.TestMutableInterval_Updates.class,
org.joda.time.TestPartial_Basics.class,
org.joda.time.chrono.TestIslamicChronology.class,
org.joda.time.TestDateTime_Properties.class,
org.joda.time.TestLocalDateTime_Basics.class,
org.joda.time.TestDateTimeUtils.class,
org.joda.time.TestLocalDate_Properties.class,
org.joda.time.format.TestISOPeriodFormatParsing.class,
org.joda.time.TestMonthDay_Basics.class,
org.joda.time.TestDateTimeZoneCutover.class,
org.joda.time.TestBasePartial.class,
org.joda.time.TestMinMaxLong.class,
org.joda.time.convert.TestCalendarConverter.class,
org.joda.time.TestAbstractPartial.class,
org.joda.time.TestYears.class,
org.joda.time.TestYearMonthDay_Basics.class,
org.joda.time.TestInterval_Constructors.class,
org.joda.time.chrono.TestJulianChronology.class,
org.joda.time.TestHours.class,
org.joda.time.tz.TestUTCProvider.class,
org.joda.time.TestYearMonthDay_Constructors.class,
org.joda.time.TestMonthDay_Properties.class,
org.joda.time.chrono.TestBuddhistChronology.class,
org.joda.time.TestDuration_Constructors.class,
org.joda.time.TestDateMidnight_Properties.class,
org.joda.time.TestPartial_Properties.class,
org.joda.time.chrono.TestCopticChronology.class,
org.joda.time.convert.TestReadableInstantConverter.class,
org.joda.time.field.TestFieldUtils.class,
org.joda.time.TestPeriod_Constructors.class,
org.joda.time.TestPartial_Match.class,
org.joda.time.convert.TestReadablePartialConverter.class,
org.joda.time.TestTimeOfDay_Constructors.class,
org.joda.time.TestDateTimeZone.class,
org.joda.time.tz.TestFixedDateTimeZone.class,
org.joda.time.TestMutableDateTime_Basics.class,
org.joda.time.format.TestISOPeriodFormat.class
})
public class totalTestSuite {
}
