/**
 * Copyright 2010 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS-IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// This file is automatically generated

package com.google.livingstories.client;

import com.google.gwt.i18n.client.LocalizableResource.DefaultLocale;
import com.google.gwt.i18n.client.LocalizableResource.Generate;

/**
 * Interface to represent the messages contained in resource bundle: ClientMessages.properties.
 * IMPORTANT NOTE - unlike most of our other files, which are automatically synced _from_ their
 * source .properties file, this .java file is the canonical version of these messages.
 * We use the @Generate annotation below to autogenerate an appropriate .properties file
 * that corresponds to this .java file.
 */
@DefaultLocale("en")
@Generate(format = "com.google.gwt.i18n.rebind.format.PropertiesFormat", locales = "en")
public interface ClientMessages extends com.google.gwt.i18n.client.Messages {
  /**
   * Translated "Events"
   */
  @DefaultMessage("Events")
  @PluralText({"one", "Event"})
  @Key("contentDisplayNameEvents")
  String contentDisplayNameEvents(@PluralCount @Optional int count);

  /**
   * Translated "People"
   */
  @DefaultMessage("People")
  @PluralText({"one", "Person"})
  @Key("contentDisplayNamePlayers")
  String contentDisplayNamePlayers(@PluralCount @Optional int count);

  /**
   * Translated "Quotes"
   */
  @DefaultMessage("Quotes")
  @PluralText({"one", "Quote"})
  @Key("contentDisplayNameQuotes")
  String contentDisplayNameQuotes(@PluralCount @Optional int count);

  /**
   * Translated "Background"
   */
  @DefaultMessage("Background")
  @Key("contentDisplayNameBackground")
  String contentDisplayNameBackground(@PluralCount @Optional int count);
  
  /**
   * Translated "Facts"
   */
  @DefaultMessage("Facts")
  @PluralText({"one", "Fact"})
  @Key("contentDisplayNameData")
  String contentDisplayNameData(@PluralCount @Optional int count);

  /**
   * Translated "Assets"
   */
  @DefaultMessage("Assets")
  @PluralText({"one", "Asset"})
  @Key("contentDisplayNameAssets")
  String contentDisplayNameAssets(@PluralCount @Optional int count);
  
  /**
   * Translated "Narratives"
   */
  @DefaultMessage("Narratives")
  @PluralText({"one", "Narrative"})
  @Key("contentDisplayNameNarratives")
  String contentDisplayNameNarratives(@PluralCount @Optional int count);

  /**
   * Translated "Reactions"
   */
  @DefaultMessage("Reactions")
  @PluralText({"one", "Reaction"})
  @Key("contentDisplayNameReactions")
  String contentDisplayNameReactions(@PluralCount @Optional int count);
  
  /**
   * Translated "Analysis".
   * 
   * @return translated "Analysis"
   */
  @DefaultMessage("Analysis")
  @Key("narrativeDisplayNameAnalysis")
  String narrativeDisplayNameAnalysis(@PluralCount @Optional int count);

  /**
   * Translated "Columns".
   * 
   * @return translated "Columns"
   */
  @DefaultMessage("Columns")
  @PluralText({"one", "Column"})
  @Key("narrativeDisplayNameColumns")
  String narrativeDisplayNameColumns(@PluralCount @Optional int count);

  /**
   * Translated "Editorials".
   * 
   * @return translated "Editorials"
   */
  @DefaultMessage("Editorials")
  @PluralText({"one", "Editorial"})
  @Key("narrativeDisplayNameEditorials")
  String narrativeDisplayNameEditorials(@PluralCount @Optional int count);

  /**
   * Translated "Features".
   * 
   * @return translated "Features"
   */
  @DefaultMessage("Features")
  @PluralText({"one", "Feature"})
  @Key("narrativeDisplayNameFeatures")
  String narrativeDisplayNameFeatures(@PluralCount @Optional int count);

  /**
   * Translated "Investigations".
   * 
   * @return translated "Investigations"
   */
  @DefaultMessage("Investigations")
  @PluralText({"one", "Investigation"})
  @Key("narrativeDisplayNameInvestigations")
  String narrativeDisplayNameInvestigations(@PluralCount @Optional int count);

  /**
   * Translated "Letters".
   * 
   * @return translated "Letters"
   */
  @DefaultMessage("Letters")
  @PluralText({"one", "Letter to the Editor"})
  @Key("narrativeDisplayNameLetters")
  String narrativeDisplayNameLetters(@PluralCount @Optional int count);

  /**
   * Translated "Op-Ed".
   * 
   * @return translated "Op-Ed"
   */
  @DefaultMessage("Op-Ed")
  @Key("narrativeDisplayNameOpEd")
  String narrativeDisplayNameOpEd(@PluralCount @Optional int count);

  /**
   * Translated "Op-Ed Columns".
   * 
   * @return translated "Op-Ed Columns"
   */
  @DefaultMessage("Op-Ed Columns")
  @PluralText({"one", "Op-Ed Column"})
  @Key("narrativeDisplayNameOpEdColumns")
  String narrativeDisplayNameOpEdColumns(@PluralCount @Optional int count);

  /**
   * Translated "Profiles".
   * 
   * @return translated "Profiles"
   */
  @DefaultMessage("Profiles")
  @PluralText({"one", "Profile"})
  @Key("narrativeDisplayNameProfiles")
  String narrativeDisplayNameProfiles(@PluralCount @Optional int count);

  /**
   * Translated "Reviews".
   * 
   * @return translated "Reviews"
   */
  @DefaultMessage("Reviews")
  @PluralText({"one", "Review"})
  @Key("narrativeDisplayNameReviews")
  String narrativeDisplayNameReviews(@PluralCount @Optional int count);
  
  /**
   * Translated "Images".
   * 
   * @return translated "Images"
   */
  @DefaultMessage("Images")
  @PluralText({"one", "Image"})
  @Key("assetDisplayNameImage")
  String assetDisplayNameImage(@PluralCount @Optional int count);
  
  /**
   * Translated "Resources".
   * 
   * @return translated "Resources"
   */
  @DefaultMessage("Resources")
  @PluralText({"one", "Resource"})
  @Key("assetDisplayNameLinks")
  String assetDisplayNameLinks(@PluralCount @Optional int count);

  /**
   * Translated "Videos".
   * 
   * @return translated "Videos"
   */
  @DefaultMessage("Videos")
  @PluralText({"one", "Video"})
  @Key("assetDisplayNameVideo")
  String assetDisplayNameVideo(@PluralCount @Optional int count);

  /**
   * Translated "Audio".
   * 
   * @return translated "Videos"
   */
  @DefaultMessage("Audio")
  @Key("assetDisplayNameAudio")
  String assetDisplayNameAudio(@PluralCount @Optional int count);

  /**
   * Translated "Graphics".
   * 
   * @return translated "Graphics"
   */
  @DefaultMessage("Graphics")
  @PluralText({"one", "Graphic"})
  @Key("assetDisplayNameInteractive")
  String assetDisplayNameInteractive(@PluralCount @Optional int count);

  /**
   * Translated "Documents".
   * 
   * @return translated "Documents"
   */
  @DefaultMessage("Documents")
  @PluralText({"one", "Document"})
  @Key("assetDisplayNameDocument")
  String assetDisplayNameDocument(@PluralCount @Optional int count);
  
  /**
   * Translated "Updated N minutes ago"
   * 
   * @return translated "Updated N minutes ago"
   */
  @DefaultMessage("Updated {0,number} minutes ago")
  @PluralText({"one", "Updated 1 minute ago"})
  @Key("nMinutesAgo")
  String nMinutesAgo(@PluralCount int count);
  
  /**
   * Translated "Updated N hours ago"
   * 
   * @return translated "Updated N hours ago"
   */
  @DefaultMessage("Updated {0,number} hours ago")
  @PluralText({"one", "Updated 1 hour ago"})
  @Key("nHoursAgo")
  String nHoursAgo(@PluralCount int count);
  
  /**
   * Translated "Updated N days ago"
   * 
   * @return translated "Updated N days ago"
   */
  @DefaultMessage("Updated {0,number} days ago")
  @PluralText({"one", "Updated 1 day ago"})
  @Key("nDaysAgo")
  String nDaysAgo(@PluralCount int count);

  /**
   * Translated "Updated N weeks ago"
   * 
   * @return translated "Updated N weeks ago"
   */
  @DefaultMessage("Updated {0,number} weeks ago")
  @PluralText({"one", "Updated 1 week ago"})
  @Key("nWeeksAgo")
  String nWeeksAgo(@PluralCount int count);

  /**
   * Translated "Updated N months ago"
   * 
   * @return translated "Updated N months ago"
   */
  @DefaultMessage("Updated {0,number} months ago")
  @PluralText({"one", "Updated 1 month ago"})
  //@Key("nMonthsAgo")
  String nMonthsAgo(@PluralCount int count);

  /**
   * Translated "Updated N years ago"
   * 
   * @return translated "Updated N years ago"
   */
  @DefaultMessage("Updated {0,number} years ago")
  @PluralText({"one", "Updated 1 year ago"})
  @Key("nYearsAgo")
  String nYearsAgo(@PluralCount int count);
  
  /**
   * Translated "N new updates since last visit"
   * 
   * @return translated "N new updates since last visit"
   */
  @DefaultMessage("{0,number} new updates since last visit")
  @PluralText({"one", "1 new update since last visit"})
  @Key("updatesSinceLastVisit")
  String updatesSinceLastVisit(@PluralCount int count);
}